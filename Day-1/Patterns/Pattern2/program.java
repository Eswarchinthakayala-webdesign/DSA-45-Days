package com.sriram.OOP3;
import java.util.*;

import java.util.regex.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      pattern2(6);
    }

    static void pattern2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
