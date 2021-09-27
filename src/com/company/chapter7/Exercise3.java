package com.company.chapter7;

public class Exercise3 {
    public static int maxvalue = 0;

    public static void indexOfMax(){
        int[] max = new int[5];

        max[0] = 1;
        max[1] = 4;
        max[2] = 7;
        max[3] = 3;
        max[4] = 8;

        //for (int q = 0; q < max.length  ; q++) {
        for (int q : max) {

            if (maxvalue < q) {
                maxvalue = q;
            }
            //System.out.println(i + ".");
        }
        System.out.println("the max value is " + maxvalue + ".");
    }

    public static void main(String[] args){
        indexOfMax();
    }
}

