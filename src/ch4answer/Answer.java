package ch4answer;

public class Answer {

//    아래 실행 결과와 같이 출력하는 다음 main()을 가진 Song 클래스를 작성하라 Song 클래스는 노래 제목 title 필두, 생성자, getTitle() 메소드로 구성된다

    public static void  main(String[] args){
        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());
    }
}
