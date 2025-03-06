package com.sriram.OOP3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      pattern(5);
    }

    static void pattern(int n)
    {

        for (int i = 1; i <=n; i++) {
            int spaces=(n-i)*2;
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    }

