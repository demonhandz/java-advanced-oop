package MultidimentionalArrays;

import java.util.Scanner;

public class P1FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];
        int[][] matrix = new int[n][n];

        switch (pattern) {
            case "A":
                fillPatternA(matrix);
                break;
            case "B":
                fillPatternB(matrix);
                break;
        }
        printMatrix(matrix);

    }

    private static void fillPatternB(int[][] matrix) {
        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            if ((row + 1) % 2 != 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = count;
                    count++;
                }
            } else {
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    matrix[col][row] = count;
                    count++;
                }

            }

        }
    }


        private static void fillPatternA ( int[][] matrix){
            int count = 1;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = count;
                    count++;
                }
            }
        }

        private static void printMatrix ( int[][] matrix){
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
        }
    }

