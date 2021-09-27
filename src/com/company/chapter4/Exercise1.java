package com.company.chapter4;

public class Exercise1 {
    //dato

    public static void printAmerican(String day, String mount, int date,int year ) {

        System.out.print("American format: ");
        System.out.printf("%s, %s, %d, %d", day, mount, date, year );
        System.out.print(".\n");
    }
    public static void printEuropean(String day, int date, String mount,int year ) {
        System.out.print("European format: ");
        System.out.printf("%s, %d, %s, %d", day, date, mount, year);
        System.out.print(".\n");
    }
    public static void main(String[] args) {
        printAmerican("Monday","jyly",22,2019);
        printEuropean("Monday",22,"Jyly",2019);

       // American format: Thursday, July 18, 2019
        //European format: Thursday 18 July 2019
    }
}
