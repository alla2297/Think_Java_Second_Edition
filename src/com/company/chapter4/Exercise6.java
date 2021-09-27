package com.company.chapter4;

public class Exercise6 {

    public static void multadd (double a, double b, double c ){
        System.out.println("a * b + c = " + (a*b+c));
        double sinP1 = Math.sin(Math.PI/4);
        double cosP1= (Math.cos(Math.PI/4))/2;
        double limed = sinP1+cosP1;
        System.out.println("opgave 6.4 = " +limed);
       expSum(1);
    }
        public static void expSum(double x) {
            double exp = Math.exp(-x);
            double root = Math.sqrt(1 - exp);
            System.out.print("opgave 6.5 = " + (x * exp + root));
        }
    public static void main(String[] args) {
	// write your code here
        multadd(1.0,2.0,3.0);



        //

    }
}
