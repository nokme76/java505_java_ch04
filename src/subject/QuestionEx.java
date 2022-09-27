package subject;


import java.util.Random;
import java.util.Scanner;

public class QuestionEx {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

////        실습 문제1번
////        char 타입의 데이터 a는 문자로는 'a' 정수로는 97로 표현
//        System.out.print("알파벳 하나를 입력하세요 : ");
//        String str = scan.next();
//        char c = str.charAt(0);
//
//        for (char a = 'a';  a <= c; a++){
//            for (char b = a; b <= c; b++) {
//                System.out.print(b);
//            }
//        System.out.println();
//        }
//
//
//
//
////        실습문제 2번
//        System.out.println("정수 10개 입력");
//        int arrInt[] = new int[10];
//
//        for (int i = 0; i<arrInt.length; i++){
//            arrInt[i] = scan.nextInt();
//        }
//        for (int i = 0; i<arrInt.length; i++){
//            if (arrInt[i]%3 ==0){
//            System.out.print(arrInt[i] + " ");
//            }
//        }
//        System.out.println();
//
//
////        실습문제 6번
////        1.eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확안
////        2.있으면 해당 index 번호 확인하고 검색 중지
////        3.kor 배열의 index 번호에 있는 단어 출력
////        4.입력된 단어가 exit 이면 프로그램 종료
//        String eng[] = {"student","love","java", "happy", "future"};
//        String kor[] = {"학생", "사랑", "자바", "행복", "미래"};
//
//
//        while(true){
//            System.out.print("영어 단어를 입력하세요>>");
//            String word = scan.next();
//            if (word.equals("exit"))
//            {
//                System.out.println("프로그램을 종료합니다");
//                break;
//            }
//            int index = -1;
//            for (int i = 0; i < eng.length; i++)
//            {
//                if (word.equals(eng[i]))
//                {
//                    index=i;
//                    break;
//                }
//            }
//
//        if (index > -1)
//        {
//            System.out.println(kor[index]);
//
//        }
//        else
//        {
//            System.out.println("그런 영어단어가 없습니다.");
//        }
//    }
//
////        for문 무한반복
//        for (;;)
//        {
//            System.out.print("영어 단어를 입력하세요>> ");
//            String word = scan.next();
//            if (word.equals("exit"))
//            {
//                break;
//            }
//            int index = -1;
//            for (int i = 0; i<eng.length; i++)
//            {
//                if (word.equals(eng[i]))
//                {
//                    index = i;
//                    break;
//                }
//            }
//            if (index > -1)
//            {
//                System.out.println(kor[index]);
//            }
//            else
//            {
//                System.out.println("잘못 입력했습니다.");
//            }
//
//        }

        Random r = new Random();
        int card;
        int high;
        int low;

        while (true)
        {
                int i = 1;
            low = 0;
            high = 99;
            card = r.nextInt(100);
            System.out.println("UP&DOWN 게임입니다. 숨겨진 수를 맞추어 보세요 ");

            while (true)
            {
                System.out.println(low + "-" + high);
                System.out.print(i + ">>");
                i++;
                int count = scan.nextInt();
                if (count > high || low > count)
                {
                    System.out.println("범위를 벗어났습니다.");
                }
                else
                {
                    if (count == card)
                    {
                        System.out.println("정답 입니다.");
                        break;
                    }
                    else if (count > card)
                    {
                        System.out.println("더 낮게");
                        high = count;
                    }
                    else
                    {
                        System.out.println("더 높게");
                        low = count;
                    }
                }
            }

            System.out.print("다시 하시겠습니까? (y/n)>> ");
            if (scan.next().equals("n"))
            {
                break;
            }

        }




    }
}
