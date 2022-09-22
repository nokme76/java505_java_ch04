//    실행용 클래스
public class Method05 {

    public static  void inCall(){
        System.out.println("Method05 클래스의 멤버 메서드");
    }
//    프로그램 실행을 위한 main 메서드
    public static void main(String[] args){

//        메소드 호출하는 방법
//        1.클래스 내부 호출 : 동일한 클래스의 멤버끼리 호출하는 것
//        2.클래스 외부 호출 : 다른 클래스의 객체를 생성하고 해당 객체의 멤버를 호출하는 것

        inCall(); // 클래스 내부 호출

        // Car2 클래스 타입의 변수 avante를 선언
//        클래스는 타입 변수는 정해진 타입이 없음
        Car2 avante ;
//        new : 메모리 공간에 생성자를 통해 생성된 객체를 등록, 등록된 메모리 주소를 반환
//        생성자 : 지정한 클래스를 기반으로 객체를 생성
        avante = new Car2(); // Car2클래스 객체가 생성되고 Car2 클래스 타입의 변수 avante에 대입되어 사용 준비가 완료됨

//      클래스 외부 호출, 객체의 멤버 호출

//      Car2클래스 에선 클래스의 멤버지만
//      Method05 에선 객체로 생성되어 객체의 멤버가됨
        avante.name = "아반테";
        avante.run();
        avante.stop();
        avante.sound();

//        Car2 클래스 타입의 객체 생성
        Car2 sonata = new Car2();

        sonata.name = "소나타";
        sonata.run();
        sonata.stop();
        sonata.sound();

        Car3 car = new Car3() ;
        car.run();
        car.stop();
        car.info();

        Car4 tucson = new Car4("투싼", "SUV");
        tucson.info();

        Car4 santafe = new Car4("싼타페","SUV");
        santafe.info();

//        오류 발생 Car4클래스의 10번확인
        Car4 carnival =  new Car4();
        carnival.name = "카니발";
        carnival.type = "SUV";
        carnival.info();

        Car5 grandeur1 = new Car5();
        grandeur1.getInfo();

        Car5 k7 = new Car5("k7", "세단", "대형");
        k7.getInfo();
        k7.getInfo("가솔린");
        k7.getInfo("고급가솔린", 4000);
        k7.getInfo("고급가솔린", "4000");
        k7.getInfo(4000, "전기");

        sum(10,20);
        sum(3.14,5.25);
        sum(3.5,5);
        sum(3,5.3);


    }

    public static void sum(int a, int b)
    {
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }
    public static void sum(double a, double b)
    {
        double result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }
    public static void sum(int a, double b)
    {
        double result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }
    public static void sum(double a, int b)
    {
        double result = a + b;
        System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    }
}
