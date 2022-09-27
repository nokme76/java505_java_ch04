package ch04Bonus;

import package1.B;

public class Box {
    private int width,height; //박스의 너비와 높이
    private char fillChar; //박스를 그리는데 사용하는 문자
    public  Box()
    { //매개 변수 없는 생성자. 10x1의 박스 생성
        this(10,1)  ;   //this 이용해서 완성
    }
    public Box(int width, int height) // 너비,높이 두 매개변수를 가진 생성자
    {
        this.width = width;
        this.height = height;
    }
    public  void draw()//박스 그리는 메소드
    {
        for (int i = 0; i < height; i++)
        {
            System.out.print("\n");
            for (int j = 0; j < width; j++)
            {
                System.out.print(fillChar);
            }
        }
    }

    public void fill(char c)
    {
        this.fillChar = c;
    }

    public static void main(String [] args){
        Box a = new Box();
        Box b = new Box(20,3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();


    }


}
