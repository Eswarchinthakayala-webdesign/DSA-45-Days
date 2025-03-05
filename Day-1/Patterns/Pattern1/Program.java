package com.sriram.OOP3;
import java.util.*;

import java.util.regex.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      pattern1(6);
    }

    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
