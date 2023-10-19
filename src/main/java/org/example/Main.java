package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("  ");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                int pascalValue = pascal(i, j);
                if (pascalValue != 0) {
                    System.out.print(pascalValue + "     ");
                }
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else if (j < 0 || j > i) {
            return 0;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}