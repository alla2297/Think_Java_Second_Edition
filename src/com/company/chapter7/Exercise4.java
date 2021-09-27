package com.company.chapter7;
import java.util.Arrays;
public class Exercise4 {
    public static void sieve(){
        int n =1;
        int[] a = new int[10];
        a[0]=1; a[1]=2;a[2]=3;a[3]=4; a[4]=5;a[5]=6;a[6]=7; a[7]=8;a[8]=9;a[9]=10;
        for (int j : a) {
            if (j % 2 == 0) {

            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        sieve();
    }
}

