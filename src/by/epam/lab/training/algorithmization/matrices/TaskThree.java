package by.epam.lab.training.algorithmization.matrices;

import java.util.Scanner;

public class TaskThree {

    /*
    2. Algorithmization

       Задачи.  Массивы массивов

    3. Дана матрица.
       Вывести k-ю строку и p-й столбец матрицы.*/

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            final int[][] DEFAULT_MATRIX = {
                    {5, 9, 9, 8, 6},
                    {4, 3, 0, 6, 4},
                    {0, 1, 0, 1, 7},
                    {9, 3, 5, 2, 0},
            };
            final int ROW_LENGTH = 4;
            final int COLUMN_LENGTH = 5;

            System.out.print("Input a ROW number(from 1 to " + ROW_LENGTH + "): ");
            int numberRow = scanner.nextInt();
            System.out.print("Input a COLUMN number(from 1 to " + COLUMN_LENGTH + ")");
            int numberColumn = scanner.nextInt();

            if ((numberRow < 1 || numberRow > ROW_LENGTH)
                    || (numberColumn < 1 || numberColumn > COLUMN_LENGTH)) {
                System.out.println("Incorrect input!");
            } else {
                System.out.println("\nAn initial array: ");
                for (int[] initial : DEFAULT_MATRIX) {
                    for (int j = 0; j < COLUMN_LENGTH; j++) {
                        System.out.print(initial[j] + "  ");
                    }
                    System.out.println();
                }
                int indexRow = (numberRow - 1);
                System.out.print("\nRow " + numberRow + ": ");
                for (int j = 0; j < COLUMN_LENGTH; j++) {
                    System.out.print(DEFAULT_MATRIX[indexRow][j] + " ");
                }
                int indexColumn = (numberColumn - 1);
                System.out.print("\nColumn " + numberColumn + ": ");
                for (int i = 0; i < COLUMN_LENGTH - 1; i++) {
                    System.out.print(DEFAULT_MATRIX[i][indexColumn] + " ");
                }
            }
        }
    }

}
