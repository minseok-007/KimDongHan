package oop;

public class basic {
    //class: object를 정의해 놓은 것; class는 object를 생성하는데 사용됨 (blueprint)
    //object: 실제로 존재하는 것.
    // class --> object (instantiation)
    // object는 property와 function(method)으로 이루어져 있음.
}

class TV {
    String color;
    boolean power; // on or off
    int channel;


    //전원을 끄거나 키는 method
    void power() {
        power = !power; //true --> false / false --> true
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    public static void main(String[] args) {
        //int [] arr  = new int[5];
        TV samsungTV = new TV();
        samsungTV.color = "Black";
        samsungTV.channel = 3;

        System.out.println(samsungTV.channel);

        samsungTV.channelUp();

        System.out.println(samsungTV.channel);


        TV[] tvArr = new TV[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new TV();
            tvArr[i].channel = i + 1;
        }
    }
}
