package ch4answer;

import java.util.Scanner;

public class PhoneManager {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("인원수>>");
        int userNum = scan.nextInt();
        Phone userlist[];
        userlist = new Phone[userNum];

        for (int i = 0; i<userlist.length; i++)
        {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = scan.next();
            String tel = scan.next();
            userlist[i] = new Phone(name, tel);

        }
        System.out.println("저장되었습니다...");


        while(true)
        {
            System.out.print("검색할 이름>>");
            String name = scan.next();
            if (name.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            boolean haveUser = false;

            for (Phone user : userlist)
            {
                if (name.equals(user.getName()))
                {
                    user.printInfo();
                    haveUser = true;
                }
            }




            if (haveUser == false)
            {
            System.out.println("다시 입력해 주세요");
            }

        }
    }
}
