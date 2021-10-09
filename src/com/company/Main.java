package com.company;

import java.util.Scanner;

public class Main {
    public static int enterMarks() {
        int i;
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 7; i++) {
            System.out.println("please enter the marks");
            i = s.nextInt();

        }
        return i;
    }


    public static void main(String[] args) {


    }
}