package com.company.chapter8;

import java.util.Scanner;

public class playFromChapter8 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        countdown(3);
        System.out.println("_______________________________");
        countup(3);
        System.out.println("_______________________________");
        System.out.println("input number you want to know binary code of");
        int dicimalnumber = scanner.nextInt();
        System.out.print("binary number of "+dicimalnumber+" is: ");
        displayBinary(dicimalnumber);
    }

    public static void countdown(int n) {           //8.1  Recursive Void Methods
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }               // why?? does it countup ?         //8.5  Counting Up Recursively
    public static void countup(int n) {        //1.n=3 4.n=2 7.n=1 10.n=0
        if (n == 0) {                          //11.n=0
            System.out.println("Blastoff!");   //12.println("Blastoff!")
        } else {                               //2. 5. 8.
            countup(n - 1);                 //3.n=2 6.n=1 9.n=0
            System.out.println(n);             //14.n=1 16.n=2 18.n=3
        }
    }                                          //13. 15. 17. 19.
/*output 8.5:
Blastoff!
1
2
3*/
    public static void displayBinary(int value) {   //8.7  Recursive Binary Method
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(+value % 2);
        }
    }
}

