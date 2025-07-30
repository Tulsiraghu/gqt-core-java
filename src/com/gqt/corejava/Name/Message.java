package com.gqt.corejava.Name;

public class Message {

    public static void main(String[] args) {
        int n = 7; // Size of each letter

        String message = "HELLO GLOBAL QUEST TECHNOLOGY";

        for (int i = 0; i < n; i++) {
            for (char ch : message.toCharArray()) {
                switch (ch) {
                    case 'A':
                        for (int j = 0; j < n; j++) {
                            if ((j == 0 && i > 0) || (j == n - 1 && i > 0) || i == 0 || i == n / 2)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'B':
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || (i == 0 || i == n / 2 || i == n - 1) && j < n - 1 || j == n - 1 && i != 0 && i != n / 2 && i != n - 1)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'C':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'D':
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || (i == 0 || i == n - 1 || j == n - 1))
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'E':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || i == n / 2 || j == 0)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'G':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || (i == n / 2 && j >= n / 2) || (j == n - 1 && i >= n / 2))
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'H':
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || j == n - 1 || i == n / 2)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'I':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == n / 2)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'L':
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || i == n - 1)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'N':
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || j == n - 1 || i == j)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'O':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'Q':
                        for (int j = 0; j < n; j++) {
                            if ((i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || (j == 0 && i < n - 1) || (j == n - 1 && i < n - 1) || (i == j && i > n / 2))
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'S':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n / 2 || i == n - 1 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2))
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'T':
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || j == n / 2)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'U':
                        for (int j = 0; j < n; j++) {
                            if ((j == 0 && i != n - 1) || (j == n - 1 && i != n - 1) || i == n - 1)
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case 'Y':
                        for (int j = 0; j < n; j++) {
                            if ((i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2) || (j == n / 2 && i >= n / 2))
                                System.out.print("# ");
                            else
                                System.out.print("  ");
                        }
                        break;

                    case ' ':
                        System.out.print("      ");
                        break;

                    default:
                        System.out.print("      ");
                        break;
                }
                System.out.print("  "); // space between characters
            }
            System.out.println(); // move to next row
        }
    }
}
