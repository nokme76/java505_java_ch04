package ch4answer;

import java.util.Scanner;

public class RectArray {

//    사각형을 표현하는 다음 Rect 클래스를 활용하여 REct 객체 배열을 생성하고, 사용자로부터 4개의 사각형을 입력받아 배열에 저장한뒤,
//    배열을 검색하여 사각형 면적의 합을 출력하는 main() 메소드를 가진 RectArray클래스를 작성하라
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//      최초 정답
//        Rect rectList[] = new Rect[4];
//
//        for (int i = 0; i<rectList.length; i++)
//        {
//            System.out.print((i+1) + " 너비와 높이 >>");
//            int weight = scan.nextInt();
//            int height = scan.nextInt();
//
//            rectList[i] = new Rect(weight,height);
//
//        }
//            int rectSum = rectList[0].getArea() + rectList[1].getArea() + rectList[2].getArea() + rectList[3].getArea();
//
//        System.out.println("저장하였습니다...");
//        System.out.println("사각형의 전체 합은 " + rectSum);
//
//
//
        Rect rectList[] ;
        System.out.print("몇개의 사각형을 입력하시겠습니까? ");
        int squareNum = scan.nextInt();
        rectList = new Rect[squareNum];

        int rectSum = 0;
        for (int i = 0; i<rectList.length; i++)
        {
            System.out.print((i+1) + " 너비와 높이 >>");
            int weight = scan.nextInt();
            int height = scan.nextInt();

            rectList[i] = new Rect(weight,height);
            rectSum += rectList[i].getArea();
        }




        System.out.println("저장하였습니다...");
        System.out.println("사각형의 전체 합은 " + rectSum);






    }
}
