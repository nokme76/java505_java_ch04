package ch04Prac;

import package1.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SemiEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        문제 1) 사칙연산을 할 수 있는 클래스 Calculator을 생성하고 정수를 2개 입력받아 계산한 프로그램을 작성하세요
//        멤버 변수 : int num1, num2, result
//        멤버 메서드 : sum, sub, milti, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태중 아무거나 사용


//        System.out.print("정수 2개를 입력해주세요>>");
//        Calculator cal = new Calculator(scan.nextInt(),scan.nextInt());
//        while (true)
//        {
//            System.out.println("+,-,*,/ 중 원하는 답을 선택해 주세요");
//            String userChoice = scan.next() ;
//            if (userChoice.equals("+"))
//            {
//                System.out.println(cal.sum());
//                break;
//            }
//            else if (userChoice.equals("-"))
//            {
//                System.out.println(cal.sub());
//                break;
//            }
//            else if (userChoice.equals("*"))
//            {
//                System.out.println(cal.mulit());
//                break;
//            }
//            else if (userChoice.equals("/"))
//            {
//                System.out.println(cal.div());
//                break;
//            }
//            else
//            {
//                System.out.println("잘못 입력하셨습니다 다시 입력해 주세요");
//            }
//
//
//        }







//        문제 2) 1 ~ 45까지의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요
//        배열을 사용하여 랜덤으로 생성된 데이터를 저장
//        Math.random()사용

        int ranArr[] = new int[6];
//
//        for (int i = 0; i < ranArr.length; i++)
//        {
//            ranArr[i] = (int)(Math.random()*44)+1;
//            System.out.print(ranArr[i] + " ");
//        }




//        문제 3) 문제 2를 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황이 발생됨 , 중복되는 숫자를 제외하고
//        총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하세요

        for (int i = 0; i < ranArr.length; i++)
        {
            int ranNum;
            ranNum = (int) (Math.random() * 6) + 1;

            for (int j = 0; j < ranArr.length; j++)
            {
                if (ranArr[j] == ranNum)
                {
                    i--;
                    break;
                }
                else
                {
                    ranArr[i] = ranNum;
                }
            }
            System.out.print(ranArr[i] + " ");
        }



////        선생님 답
//        int lotto2[] = new int[7];
//
//        for (int i = 0; i < lotto2.length;i++)
//        {
////            랜덤 숫자 생성 1~45
//            int rnd = (int)((Math.random() * 45) + 1);
//
////            중복제거
//            for (int j = 0; j < i; j++)
//            {
////                동일한 값이 있는지 확인
//                if (rnd == lotto2[j])
//                {
////                    동일한 값이 있을 경우 현재 루프를 다시 한번 더 실행함
//                    i--; // 나중에 자동으로 1 증가할 카운트 변수를  먼저 1 감소 시켜서 동일한 값이 나올 수 있도록 변경함, 동일한 번호 루프를 돌 수 있게 됨
//                    break;
//                }
////                동일한 값이 아니면 저장
//                lotto2[i] = rnd;
//            }
//
////            첫번째 루프의 경우 중복 제거 루틴으로 빠지지 않기 때문에 데이터가 저장되는 부분이 없으므로 0번 루프때만 저장되는 if문
//            if (i == 0)
//            {
//                lotto2[i] = rnd;
//            }
//        }
//
////        순서 정리
//        Arrays.sort(lotto2);
//        for (int i = 0; i < lotto2.length; i++)
//        {
//            System.out.print(lotto2[i] + " ");
//        }

    }
}
