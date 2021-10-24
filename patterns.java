package com.company;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        System.out.println("Enter how many lines you need:");
        Scanner myinput=new Scanner(System.in);
        int num=myinput.nextInt();
//        pattern1(num);
        pattern8(num);
    }

    private static void pattern2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <num ; j++) {
                if (i==0 || i==num-1 || j==0 || j==num-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern1(int num) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern3(int num){
        for(int i =0;i<num;i++){
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern4(int num){
        for(int i =num;i>=0;i--){
            for (int j = 0; j <=i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern5(int num){
        for(int i=1;i<=num;i++){
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void pattern6(int num){
        for(int i=num;i>=1;i--){
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void pattern7(int num){
        int count=1;
        for(int i=1;i<num;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    private static void pattern8(int num){
        for(int i=1;i<=num;i++){
            for (int j = 0; j <i ; j++) {
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
