package ch04Bonus;

public class CircleManager {//static 메소드만 가짐
    static void  copy(Circle src, Circle dest)
    {
        dest.setRadius(src.getRadius());//src의 반지름을 dest에 복사
    }
    static boolean equals(Circle a, Circle b)
    { //a와 b의 반지름이 같으면 true 리턴
        if (a.getRadius() == b.getRadius())
            return true;
        else
        {
            return false;
        }
    }
}
