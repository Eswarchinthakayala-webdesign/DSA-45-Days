package com.sriram.OOP3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      pattern(5);
    }

    static void pattern(int n)
    {
        n=2*n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                int left=j;
                int right=n-j;
                int top=i;
                int down=n-i;
                int val=Math.min(left,Math.min(right,Math.min(top,down)));
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
