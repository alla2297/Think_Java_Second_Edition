package com.company.chapter9;

public class Exercise1 {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Hello World!");
        System.out.print("The Clock is ");
        for(int hour = 2; hour <= 24; hour++){
            System.out.print(hour);
            System.out.print(":");
            for (int minute =57; minute<60;minute++){
                System.out.print(minute);
                System.out.print(".");
                System.out.print("\n");
            }
        }

    }
}


