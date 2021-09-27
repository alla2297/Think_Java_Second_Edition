package com.company.chapter2;

public class Exercise3_1 {

    public static void main(String[] args) {
        // write your code here

        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
        System.out.print("And the Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);
        System.out.print("the number of seconds remaining in the day: ");
        System.out.println(86400-(((hour*60)+minute)*60));
        System.out.print("the percentage of the day that has passed: ");
        System.out.println((((((hour*60)+minute)*60) *100)/ 86400)+"%");
    }





}
