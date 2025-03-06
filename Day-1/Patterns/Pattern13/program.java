package com.sriram.OOP3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {

        int index=1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {
                char ch=(index%2==0)?(char)(65+index-1):(char)(97+index-1);
                System.out.print(ch);
                index++;
            }
            System.out.println();

        }


    }
}

