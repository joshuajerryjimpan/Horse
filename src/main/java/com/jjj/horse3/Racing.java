package com.jjj.horse3;

public class Racing {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.start();
        Horse h2 = new Horse();
        h2.start();
        Horse h3 = new Horse();
        h3.start();
        HorseRunnable hr = new HorseRunnable();
        Thread h4 = new Thread(hr);
        h4.start();
    }
}
