package ch04Prac;

public class Calculator {
    private int num1, num2, result;

    public Calculator(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int sum()
    {
        result = num1 + num2;
        System.out.print(num1 + "+" + num2 + "은 : ");
        return result;
    }
    public int sub()
    {
        result = num1 - num2;
        System.out.print(num1 + "-" + num2 + "은 : ");
        return result;

    }
    public int mulit()
    {
        result = num1 * num2;
        System.out.print(num1 + "*" + num2 + "은 : " );
        return result;
    }
    public int div()
    {
        result = num1 / num2;
        System.out.print(num1 + "/" + num2 + "은 : " );
        return result;
    }



}
