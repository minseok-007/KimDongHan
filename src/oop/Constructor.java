package oop;

public class Constructor {
    // Constructor (생성자): A constructor is a special method of a class or structure in object-oriented programming
    // that initializes a newly created object of that type. Whenever an object is created, the constructor is called automatically.
}

class Car {
    String color;
    String gearType;
    int door;

    Car () {
        this("white", "auto", 4); // 같은 클래스의 다른 constructor 호출
    }
    Car (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public static void main(String[] args) {
        Car MScar = new Car();
//        MScar.color = "Black";
//        MScar.gearType = "manual";
//        MScar.door = 2;

        Car DHcar = new Car("white", "auto", 2);

    }
}
