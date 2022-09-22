import java.util.Scanner;

public class Method03 {


//        -----------------------------------------------------------
//        -----------------------------------------------------------
//    메서드 선언부
//                (반환값) (매개변수)
//     구구단 함수 입력부
    private static int input()
    { //메서드 실행부
        Scanner scan = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요 : ");
        int dansu = scan.nextInt();
        return dansu;
    }

//     구구단 함수 출력부
    public static void output(int dansu) {
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " * " + i + " = " + dansu * i);
        }
    }
//        -----------------------------------------------------------
//        -----------------------------------------------------------

//    점수 입력부
    public static int inputScore()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("점수를 입력해 주세요 : ");
        int score = scan.nextInt();
        return score;
    }

//    점수 계산부
    public static String calLevel(int score)
    {
        String level = "F";

        if (score >= 90) {
            level = "A";
        }
        else if (score >= 80) {
            level = "B";
        }
        else if (score >= 70) {
            level = "C";
        }
        else if (score >= 60) {
            level = "D";
        }

        return level;
    }

//    점수,등급 출력부

    public  static void printResult(int score, String level)
    {
        System.out.println("당신의 총점은 " + score + "점이고, 등급은 " + level + "입니다.");
    }

//        -----------------------------------------------------------
//        -----------------------------------------------------------

//    //예전 구구단 함수

//    public static void gugudan(int dan) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//    }

//        -----------------------------------------------------------
//        -----------------------------------------------------------
//        public static String scores(int avg) {
//            String level = "F";
//
//            if (avg >= 90) {
//                level = "A";
//            }
//            else if (avg >= 80) {
//                level = "B";
//            }
//            else if (avg >= 70) {
//                level = "C";
//            }
//            else if (avg >= 60) {
//                level = "D";
//            }
//
//            return level;
//        }
//    public static double average(int total) {
//        return (double)total / 3;
//    }
//        -----------------------------------------------------------
//        -----------------------------------------------------------

//    점수 입력부
    public static int scoreInput(String course)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print(course + "점수를 입력해주세요 : ");
        int score = scan.nextInt();

//        소스코드 중복
//        System.out.print("영어 점수를 입력해주세요 : ");
//        int eng = scan.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        int math = scan.nextInt();

        return score;
    }

//    점수 총합
    public static int totalCal(int kor, int eng, int math)
    {
        return kor + eng + math;
    }

//    평균 계산
    public static double avgCal(int total)
    {
        return  (double)(total)/3;
    }

//    등급 계산
    public static String levelCal(double avg)
    {
        String level ="F";

        if (avg >= 90) {
            level = "A";
        }
        else if (avg >= 80) {
            level = "B";
        }
        else if (avg >= 70) {
            level = "C";
        }
        else if (avg >= 60) {
            level = "D";
        }
        return level;
    }

//    점수 평균 등급 출력부
    public static void  printResult(int total , double avg, String level)
    {
        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");
    }



//        -----------------------------------------------------------
//        -----------------------------------------------------------

    public static void main(String [] args){


//        -----------------------------------------------------------
//        -----------------------------------------------------------
//        gugudan(dansu);
//        System.out.println("\n----- 2번 문제 -----\n");
//        System.out.print("출력할 구구단 단수를 입력하세요 : ");
//        int dansu = scanner.nextInt();
//
//        gugudan(dansu);
//
//        -----------------------------------------------------------
//        -----------------------------------------------------------
//        구구단 쉽게 만들기~

//        int dansu = input();
//
//        output(dansu);

//        -----------------------------------------------------------
//        -----------------------------------------------------------

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("점수를 입력해 주세요 : ");
//        int score = scan.nextInt();
//        String level = "F";
//
//            if (score >= 90) {
//                level = "A";
//            }
//            else if (score >= 80) {
//                level = "B";
//            }
//            else if (score >= 70) {
//                level = "C";
//            }
//            else if (score >= 60) {
//                level = "D";
//        System.out.println("당신의 총점은 " + score + "점이고, 등급은 " + level + "입니다.");

//       ------------------------------------------------------------
//       ------------------------------------------------------------

//        int score = inputScore();
//        String level = calLevel(score);
//        printResult(score, level);

//        -----------------------------------------------------------
//        -----------------------------------------------------------


//        Scanner scan = new Scanner(System.in);
//
//        int kor = 0;
//        int eng = 0;
//        int math = 0;
//        int total = 0;
//        double avg = 0.0;
//        String level = "F";
//
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scan.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scan.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scan.nextInt();
//
//        total = kor + eng + math;
//        avg = (double)(total)/3;
//
//            if (avg >= 90) {
//                level = "A";
//            }
//            else if (avg >= 80) {
//                level = "B";
//            }
//            else if (avg >= 70) {
//                level = "C";
//            }
//            else if (avg >= 60) {
//                level = "D";
//            }
//        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");

//        -----------------------------------------------------------
//        -----------------------------------------------------------

        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0;
        String level = "F";

        kor = scoreInput("국어");
        eng = scoreInput("영어");
        math = scoreInput("수학");

        total = totalCal(kor,eng,math);
        avg = avgCal(total);
        level = levelCal(avg);

        printResult(total,avg,level);

//        -----------------------------------------------------------
//        -----------------------------------------------------------

//        int kor = 0;
//        int eng = 0;
//        int math = 0;
//        int total = 0;
//        double avg = 0.0;
//
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scan.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scan.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scan.nextInt();
//
//        total = kor + eng + math;
//        avg = average(total);
//        level = scores((int)avg);
//
//        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");
    }
}
