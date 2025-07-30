package com.gqt.corejava.Name;

public class Rakshitha {
    public static void main(String[] args) {
        int n = 7; // size of the pattern (height)

        for (int i = 0; i < n; i++) {
            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i <= n / 2) || (i - j == n / 2))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i > 0) || (j == n - 1 && i > 0) || i == 0 || i == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // K
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i + j == n / 2) || (i - j == n / 2))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // S
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n / 2 || i == n - 1 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // H (again)
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // A (again)
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i > 0) || (j == n - 1 && i > 0) || i == 0 || i == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
