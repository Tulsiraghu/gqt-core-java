package com.gqt.corejava.Martics;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get dimensions for first matrix
        System.out.println("FIRST MATRIX");
        System.out.print("Enter number of rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols1 = sc.nextInt();
        
        // Create first 2D array
        int[][] matrix1 = new int[rows1][cols1];
        
        // Input first matrix elements
        System.out.println("Enter elements for first matrix:");
        inputMatrix(matrix1, sc);
        
        // Get dimensions for second matrix
        System.out.println("---- SECOND MATRIX ----");
        System.out.print("Enter number of rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols2 = sc.nextInt();
        
        // Create second 2D array
        int[][] matrix2 = new int[rows2][cols2];
        
        // Input second matrix elements
        System.out.println("Enter elements for second matrix:");
        inputMatrix(matrix2, sc);
        
        // Print both matrices
        System.out.println("---- FIRST MATRIX ----");
        printMatrix(matrix1);
        
        System.out.println("---- SECOND MATRIX ----");
        printMatrix(matrix2);
        
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] multiMatrix = multiMatrices(matrix1, matrix2);
            System.out.println("---- SUM OF MATRICES ----");
            printMatrix(multiMatrix);
        }
        
        sc.close();
    }
    
    private static int[][] multiMatrices(int[][] matrix1, int[][] matrix2) {
		// TODO Auto-generated method stub
    	int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	for(int k=0;k<cols;k++) {
                sum[i][j] = sum[i][j]+(matrix1[i][k] * matrix2[k][j]);
            }
        }
    }
		return sum;
    }

	// Method to input matrix elements
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    
    // Method to print 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // New line after each row
       }
    }
    
}