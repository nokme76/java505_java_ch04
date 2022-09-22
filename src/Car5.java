public class Car5 {
    public String name;
    public String type;
    public String size;
    public String color;

//    this() : 클래스의 생성자를 호출하는 명령어

    public Car5(String carName, String carType, String carSize, String carColor)
    {
        name = carName;
        type = carType;
        size = carSize;
        color = carColor;
    }

    public Car5(String carName, String carType, String carSize)
    {
        this(carName,carType,carSize,"흰색");
//        name = carName;
//        type = carType;
//        size = carSize;
//        color = "흰색";

    }
    public Car5(String carName, String carType )
    {
        this(carName,carType,"대형");
//        this(carName,carType,"대형","흰색");
//        name = carName;
//        type = carType;
//        size = "대형";
//        color = "흰색";
    }

    public Car5(String carName)
    {
        this(carName,"세단");
//        this(carName,"세단","대형","흰색");
//        name = carName;
//        type = "세단";
//        size = "대형";
//        color = "흰색";
    }


    public Car5()
    {
        this("그랜져");
//        this("그랜져", "세단", "대형","흰색");
//        name = "그랜져";
//        type = "세단";
//        size = "대형";
//        color = "흰색";

    }


//      메서드 오버로딩 : 이름이 간튼 메서드를 여러개 선언하는 것
//      조건 : 매개변수의 타입, 개수 ,순서 중 하나라도 다르면 됨
//      메서드 오버로딩을 사용하는 이유 : 비슷한 기능을 제공하는 메서드를 여러개 생성 시 각각 다른 이름을 제공하는 것보다 동일한 이름을 사용하는 것이 용이 하기 때문
    public void getInfo()
    {
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 : " + size + "\n색상 : " + color);
        System.out.println("------------");
    }

    public void getInfo(String gas)
    {
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 : " + size + "\n색상 : " + color + "\n연료 : " + gas);
        System.out.println("------------");
    }

//    개수를 변경
    public void getInfo(String gas, int price)
    {
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 : " + size + "\n색상 : " + color + "\n연료 : " + gas + "\n가격 : " + price);
        System.out.println("------------");
    }

//    순서를 변경
    public void getInfo(int price,String gas)
    {
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 : " + size + "\n색상 : " + color + "\n연료 : " + gas + "\n가격 : " + price);
        System.out.println("------------");
    }
//    타입을 변경
    public void getInfo(String gas, String  price)
    {
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 : " + size + "\n색상 : " + color + "\n연료 : " + gas + "\n가격 : " + price);
        System.out.println("------------");
    }
}
