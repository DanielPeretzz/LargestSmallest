package com.company.danielproject;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter a amount number : ");
        int amount = SCANNER.nextInt();
        final int[] arrNum = new int[amount];
        for (int i = 0;i < arrNum.length;i++){
            System.out.print("Please enter Value number : ");
            arrNum[i] = SCANNER.nextInt();

        }
        Arrays.sort(arrNum);
        System.out.println("The Largest number is : " + arrNum[amount - 1] );
        System.out.println("The Smallest number is :" + arrNum[0]);




    }


}







