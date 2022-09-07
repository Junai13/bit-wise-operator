package com.septsix;

import java.util.Scanner;
public class Dup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,dupli=0,i;
        System.out.print(" size of  array: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (i=0; i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        System.out.println("duplicate elements of array:");
        for (i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                dupli=a[i]^a[j];

                if (dupli==0)
                {
                    System.out.println(a[i]);
                }
            }
        }
        if(dupli != 0)
            System.out.println("There is no duplicate in array.");

    }
}
