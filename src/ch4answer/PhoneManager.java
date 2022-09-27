package ch4answer;

import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {

//        문제4)
//        1.사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
//        2.지정한 크기 만큼의 사용자 정보 입력받음
//        3.사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안의 내용과 비교
//        4.있으면 정보 출력, 없으면 없습니다. 출력
//        5.exit를 입력 받으면 프로그램 종료

        Scanner scan = new Scanner(System.in);

        System.out.print("인원수>>");
//        1.사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
        int userNum = scan.nextInt();
        Phone userList[];
        userList = new Phone[userNum];

//        2.지정한 크기 만큼의 사용자 정보 입력받음
        for (int i = 0; i < userList.length; i++)
        {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
//            String name = scan.next();
//            String tel = scan.next();
//            userlist[i] = new Phone(name, tel);
            userList[i] = new Phone(scan.next(), scan.next());
        }
        System.out.println("저장되었습니다...");


        while (true)
        {
//        3.사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안의 내용과 비교
            System.out.print("검색할 이름>>");
            String name = scan.next();
//        5.exit를 입력 받으면 프로그램 종료
            if (name.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            boolean haveUser = false;
//        4.있으면 정보 출력, 없으면 없습니다. 출력
            for (Phone user : userList)
            {
                if (name.equals(user.getName()))
                {
                    user.printInfo();
                    haveUser = true;
                    break;
                }
            }
            if (haveUser == false)
            {
                System.out.println(name + "이 없습니다. 다시 입력해 주세요");
            }
        }

//        선생님 정답
        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = scan.next();
            int index = -1; // 배열의 index 번호를 저장할 변수, 검색 불가 : -1 검색완료 : 검색된 index번호

//        5.exit를 입력 받으면 프로그램 종료
            if (searchName.equals("exit")) {
                break;
            }
            for (int i = 0; i < userList.length; i++) {
//          검색어로 입력한 이름과 전화번호부에 저장된 이름이 같은지 확인
                if (searchName.equals(userList[i].getName())) {
                    index = i; // 해당 index 번호를 변수 index에 저장
                    break;
                }
            }
//          검색어로 검색한 결과를 확인
            if (index > -1) {
                System.out.println(userList[index].getName() + "의 번호 " + userList[index].getTel());
            } else {
                System.out.println(searchName + " 이 없습니다.");
            }
        }
    }
}