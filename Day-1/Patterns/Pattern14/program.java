package com.sriram.OOP3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j>=1 ; j--) {

                char ch=(char)(65+(n-j+1)-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }


    }
}

