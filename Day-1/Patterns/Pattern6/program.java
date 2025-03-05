package com.sriram.OOP3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      pattern(5);
    }

    static void pattern(int n)
    {
        for (int i = 1; i <=2*n-1; i++) {
            int stars=Math.min(i,2*n-i);
            int spaces=n-stars;

            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
                for (int j = 1; j <=stars; j++) {
                    System.out.print("* ");
                }

            System.out.println();
        }
    }
}
