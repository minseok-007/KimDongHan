package oop;

public class overriding {
    //Overriding: parent 클래스로부터 상속받은 메서드의 내용을 변경하는 것. 상속받은 메서드를 그대로 사용하기도 하지만,
    // 자신에 맞게 변경해야 하는 경우에 override 해줌.

    //오버라이딩의 조건
    // child class의 overriding method는 parent class의 method와 이름이 일치, parameter 같아야함, return type 같아야 함
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    String getLocation() {
        //return "x: " + x + ", y: " + y + ", z:" + z;
        return super.getLocation() + ", z:" + z;
    }
}