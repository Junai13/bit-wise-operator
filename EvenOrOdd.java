package com.septsix;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n&1) == 1){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
