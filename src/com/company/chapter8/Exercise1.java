package com.company.chapter8;

public class Exercise1 {
    public static void main (String[] args){
        /*
        Write a program that displays the entire lyrics of “99 Bottles of Beer”.
        Your program should include a recursive method that does the hard part,
        but you might want to write additional methods to separate other parts of the program.
        As you develop your code, test it with a small number of verses, like 3
         */
        countdownBottles(100);          //can editor the number runs here
    }

    public static void countdownBottles(int n) {
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!");

        } else {
            System.out.println(n+" bottles of beer on the wall,");
            System.out.println(n+" bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println((n-1)+" bottles of beer on the wall.\n");
            countdownBottles(n - 1);
        }
    }
}

