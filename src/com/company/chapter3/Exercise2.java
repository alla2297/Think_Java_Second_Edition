package com.company.chapter3;

import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {

            System.out.println("Indtast celsius");
            double Celsius = scanner.nextDouble();
            double Fahrenheit = Celsius * (9.0 / 5.0) + 32;
            System.out.print("Fahrenheit: ");
            System.out.println(Fahrenheit);
            System.out.print("Celsius: ");
            System.out.println(Celsius);
        }
    }
}
