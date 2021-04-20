package com.jjj.horse1;

public class Racing {
    public static void main(String[] args){
        String name1 = "Horse 1";
        String name2 = "Horse 2";
        for (int i = 0; i < 10000; i++) {
         System.out.println(name1+" "+i);
         System.out.println(name2+" "+i);
        }
    }
}
