package ch4answer;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.print("이름과 전화번호 입력 >>");
        Phone p1 = new Phone(scan.next(),scan.next());
        System.out.print("이름과 전화번호 입력 >>");
        Phone p2 = new Phone(scan.next(),scan.next());


        System.out.println(p1.getName()+ "의 번호 " + p1.getTel());
        System.out.println(p2.getName() + "의 번호 " + p2.getTel());
    }


}
