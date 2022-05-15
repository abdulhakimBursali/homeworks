package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15,12,788,1,2,0,7};

        System.out.println("Bir sayı giriniz.");
        Scanner inp = new Scanner(System.in);
        int value = inp.nextInt();

        int maxValue = list[0];
        for (int i : list) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        int min = maxValue;
        int max = maxValue;

        for (int j : list) {
            if (j < value &&  min  < value - j) {
                min = j;
            }

            if (j > value && j - value < max) {
                max = j;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
