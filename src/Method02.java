import java.util.Scanner;

public class Method02 {

    private  static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
//        문제 1) 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성하여 실행하는 프로그램을 작성하세요
//          1.더하기, 빼기, 곱하기, 나누기를 각각 4가지 형태로 생성
//          2.각 1번타입 함수 이름 : sum1~4, sub1~4, multi1~4, div1~4
//          3.각각의 함수를 모두 실행하여 결과를 확인






        System.out.println("\n------- 1번 -------\n");
        sum1();
        sub1();
        multi1();
        div1();

        System.out.println("\n------- 2번 -------\n");

        sum2(15,5);
        sub2(15,5);
        multi2(15,5);
        div2(15,5);

        System.out.println("\n------- 3번 -------\n");

        sum3();
        int result = sum3();
        System.out.println("두 수의 덧셈은 : " + result);
        sub3();
        int sResult = sub3();
        System.out.println("두 수의 뺄셈은 : " + sResult);
        multi3();
        int mResult = multi3();
        System.out.println("두 수의 곱셈은 : " + mResult);
        div3();
        int dResult = div3();
        System.out.println("두 수의 나눗셈은 : " + dResult);

        System.out.println("\n------- 4번 -------\n");


        sResult = sub4(15,5);
        System.out.println("두 수의 뺄셈은 : " + sResult);
        result = sum4(15,5);
        System.out.println("두 수의 덧셈은 : " + result);
        mResult = multi4(15,5);
        System.out.println("두 수의 곱셈은 : " + mResult);
        dResult = div4(15,5);
        System.out.println("두 수의 나눗셈은 : " + dResult);


//        문제 2) 사용자 입력을 통해서 2 ~ 9까지 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성하세요
//          1. 구구단을 출력하는 부분을 함수로 구현 (함수명 : gugudan)
//          2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨

        gugudan();




//        문제 3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고, 총점, 평균, 등급을 출력하는 프로그램을 작성하세요
//          1. 등급 계산 부분을 함수로 구현 (함수명 : scores)
//          2. 총점과 평균 계산 부분을 함수로 구현 (함수명 :average)
//          3. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨


        System.out.println("수학 점수를 기입해주세요.");
        int math = scan.nextInt();
        System.out.println("국어 점수를 기입해주세요.");
        int kor = scan.nextInt();
        System.out.println("영어 점수를 기입해주세요.");
        int eng = scan.nextInt();
        int sum = 0;
        float avg = 0;

        average(kor, eng, math,sum,avg );


        scroes(avg);






    }

//        덧셈
    public static void sum1()
    {
        int a = 30;
        int b = 10;
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result);
    }
    public static void sum2(int a, int b)
    {
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result);
    }
    public static int sum3()
    {
        int a = 30;
        int b = 10;
        int result = a + b;
        return result;
    }
    public static int sum4(int a, int b)
    {
        int result = a + b;
        return result;
    }

//    뺄셈
    public static void sub1()
    {
        int a = 30;
        int b = 10;
        int result = a - b;
        System.out.println("두 수의 뺄셈은 : " + result);
    }
    public static void sub2(int a, int b)
    {
        int result = a - b;
        System.out.println("두 수의 뺄셈은 : " + result);
    }
    public static int sub3()
    {
        int a = 30;
        int b = 10;
        int result = a - b;
        return result;
    }
    public static int sub4(int a, int b)
    {
        int result = a - b;
        return result;
    }

//    곱셈

    public static void multi1()
    {
        int a = 30;
        int b = 10;
        int result = a * b;
        System.out.println("두 수의 곱셈은 : " + result);
    }
    public static void multi2(int a, int b)
    {
        int result = a * b;
        System.out.println("두 수의 곱셈은 : " + result);
    }
    public static int multi3()
    {
        int a = 30;
        int b = 10;
        int result = a * b;
        return result;
    }
    public static int multi4(int a, int b)
    {
        int result = a * b;
        return result;
    }

//    나눗셈

    public static void div1()
    {
        int a = 30;
        int b = 10;
        int result = a / b;
        System.out.println("두 수의 나눗셈은 : " + result);
    }
    public static void div2(int a, int b)
    {
        int result = a / b;
        System.out.println("두 수의 나눗셈은 : " + result);
    }
    public static int div3()
    {
        int a = 30;
        int b = 10;
        int result = a / b;
        return result;
    }
    public static int div4(int a, int b)
    {
        int result = a / b;
        return result;
    }

//    구구단 함수
    public static void gugudan()
    {
        System.out.println("2~9 원하는 구구단 숫자를 입력해 주세요.");
        int n = scan.nextInt();
        int i = 1;
        while (i<10)
        {
            int result = n * i;
            System.out.println(n + "단 : " + n + " * " + i + " = " + result);
            i++;
        }
//        for (int i = 1; i<10; i++)
//        {
//
//        }

    }


    //          1. 등급 계산 부분을 함수로 구현 (함수명 : scores)
//          2. 총점과 평균 계산 부분을 함수로 구현 (함수명 :average)








    public static float average(int kor, int eng, int math, int sum, float avg )
    {

        sum = kor + eng + math;

        avg = (sum)/3 ;

        System.out.println("세 과목 총점은 : " + sum);
        System.out.println("세 과목 평균은 : " + avg);

        return avg;

    }

    public static void  scroes(float avg)
    {

        if (avg>=90)
        {
            System.out.println("평균은 : " + avg + "점 이고, 등급은 : A 입니다");

        } else if (avg>=80)
        {
            System.out.println("평균은 : " + avg + "점 이고, 등급은 : B 입니다");

        } else if (avg>=70)
        {
            System.out.println("평균은 : " + avg + "점 이고, 등급은 : C 입니다");

        } else if (avg>=60)
        {
            System.out.println("평균은 : " + avg + "점 이고, 등급은 : D 입니다");

        }else
        {
            System.out.println("평균은 : " + avg + "점 이고, 등급은 : F 입니다");
        }


    }



}

