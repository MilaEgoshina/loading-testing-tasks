package com.example.loading.task3;

import java.util.Random;
import java.util.Scanner;

public class FindMinDiagonalElement {

    public static void main(String[] args) {

        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println("Минимальный элемент диагонали: " + findMinDiagonalElement(matrix));
    }

    /**
     * Finds the minimum element on the diagonals of a square matrix, excluding the
     * central element if the matrix size is odd.
     *
     * @param matrix The square matrix in which to find the minimum diagonal element.
     * @return The minimum element found on the diagonals, excluding the central element.
     */
    public static int findMinDiagonalElement(int[][] matrix) {
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (i != matrix.length - 1 - i) { // исключаем элемент пересечения
                if (matrix[i][matrix.length - 1 - i] < minElement) {
                    minElement = matrix[i][matrix.length - 1 - i];
                }
            }
        }
        return minElement;
    }

    private static int[][] generateMatrix(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N (N >= 3, нечётное): ");
        int n = scanner.nextInt();

        if (n % 2 == 0 || n < 3) {
            System.out.println("Число должно быть нечётным и больше или равно 3.");
        }

        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100); // заполняем случайными числами до 100
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
