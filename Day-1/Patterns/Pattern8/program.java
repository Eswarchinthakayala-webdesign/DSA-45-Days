package com.sriram.OOP3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      pattern(5);
    }

    static void pattern(int n)
    {
        for (int i = 1; i <=2*n-1; i++) {
            int col=Math.min(i,2*n-i);
            int spaces=n-col;
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = col; j >0 ; j--) {
                System.out.print(j);
            }
            for (int j =2; j<=col ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
