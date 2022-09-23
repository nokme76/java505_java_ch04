package package1;


//  접근 제한자 public 사용 중
//public class B {
//    A a ;
//
//}

////  클래스 A를 사용하여 객체를 생성
//public class B {
////    클래스 A의 생성자 중 public 을 사용한 생성자로 객체 생성
////    public 을 사용하여 다른 패키지에서 사용 가능
//    A a1 = new A(true);
//
////    클래스 A의 생성자 중 default 을 사용한 생성자로 객체 생성
////    default 를 사용하여 같은 패키지 내에서 사용 가능
//    A a2 = new A(1);
//
////    클래스 A의 생성자 중 private 을 사용한 생성자로 객체 생성
////    private는 해당 클래스 내에서만 사용가능
//    A a3 = new A("문자열");
//}

public class B {
    public B(){
        A a = new A();
//        value1은 public 으로 설정되어 모두 접근 가능
        a.value1 = 10;
//        value2는 default 로 설정되어 동일한 패키지 내에서는 접근 가능 다른 패키지는 불가
        a.value2 = 20;
//        value3은 private 로 설정되어 외부에서는 접근 불가
//        a.value3 = 30;
        a.method1();
        a.method2();
//        method3은 private 로 설정되어 외부에서는 접근 불가
//        a.method3();
    }

}