package com.company.Lec15;

public class CLient {

    public static void main(String[] args) {

        NitroEngine engine = new NitroEngine();
        System.out.println(engine.accspeed);
        engine.stop();
        engine.start();
        engine.accelerate();

        engine.gear();


        System.out.println(sum(1,23,4,5,9,9,9,9,9,9,9,9,9,99,9,9,9,9,9,9));

    }

    public static int sum(int ...ar){
          int s=0;
        for (int i = 0; i <ar.length ; i++) {
            s=s+ar[i];
        }
        return s;
    }
}
