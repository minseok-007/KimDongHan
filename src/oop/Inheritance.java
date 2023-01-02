package oop;

public class Inheritance {
    // Inheritance: the sub or child class inherits the properties and characteristics of the super or parent class
    // parent class --> child class (variable, method)
}

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

class SamsungTv extends Tv {

}

class SmartTv extends Tv {
    String mode; // basic, netflix, youtube

    void changeMode(String newMode) {
        mode = newMode;
    }
}

class SmartTvTest{
    public static void main(String[] args) {
        SmartTv st1 = new SmartTv();
        st1.channel = 3;
        st1.channelUp();
        System.out.println(st1.channel);
    }
}
