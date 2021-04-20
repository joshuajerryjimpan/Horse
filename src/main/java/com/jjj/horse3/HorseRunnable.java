package com.jjj.horse3;

public class HorseRunnable implements Runnable{
    public void run() {
        Thread h4 = new Thread();
        for (int i = 0; i < 10000; i++) {
            System.out.println(h4.getName()+" "+i);
        }
    }
}
