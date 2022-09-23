package package2;
//
////  class A 는 접근제한자를 default를 사용하고 있어 다른 패키지에서 사용할 수 없음
////import package1.A;
////  class B 는 접근제한자를 public으로 사용하고 있어 다른 패키지 내에서 사용할 수 있음
////import package1.B;
////
////public class C {
////    A a;
////    B b;
////}
//
//
//import package1.A;
//
////  다른 패키지에 있는 class A 를 사용하여 객체 생성
//public class C {
////    클래스 A의 생성자 중 public 을 사용한 생성자로 객체 생성
////    public 을 사용하여 다른 패키지에서 사용 가능
//    A a1 = new A(true);
////    클래스 A의 생성자 중 default 을 사용한 생성자로 객체 생성
////    default 를 사용하여 같은 패키지 내에서 사용 가능 다른 패키지에서는 사용 불가
//    A a2 = new A(1);
////    클래스 A의 생성자 중 private 을 사용한 생성자로 객체 생성
////    private는 해당 클래스 내에서만 사용가능
//    A a3 = new A("문자열");
//
//}

import package1.A;

public class C {
    public C()
    {
        A a = new A();
        a.value1 = 1000;
//        클래스 A의 value2는 default를 사용하여 다른 패키지에서 접근 불가
//        a.value2 = 2000;
//        클래스 A의 value3는 private를 사용하여 다른 패키지에서 접근 불가
//        a.value3 = 3000;

        a.method1();
//        클래스 A의 method2는 default를 사용하여 다른 패키지에서 접근 불가
//        a.method2();
//        클래스 A의 method3는 private를 사용하여 다른 패키지에서 접근 불가
//        a.method3();

    }
}