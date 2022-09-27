package ch04Bonus;

public class StaticTest {
    public static void main(String[] args){
        Circle pizza = new Circle(5);
        Circle waffle = new Circle(1);

        boolean res = pizza.getRadius() == waffle.getRadius();
        if (res == true)
        {
            System.out.println("pizza와 waffle 크기 같음");
        }
        else
        {
            System.out.println("pizza와 waffle 크기 다름");
        }
        CircleManager.copy(pizza,waffle);
        res = pizza.getRadius() == waffle.getRadius();
        if (res == true)
        {
            System.out.println("pizza와 waffle 크기 같음");
        }
        else
        {
            System.out.println("pizza와 waffle 크기 다름");
        }
    }
}
