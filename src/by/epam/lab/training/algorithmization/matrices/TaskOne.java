package by.epam.lab.training.algorithmization.matrices;

public class TaskOne {

    /*
    2. Algorithmization

       Задачи. Массивы массивов

    1. Дана матрица. Вывести на экран все нечетные столбцы,
       у которых первый элемент больше последнего.
    */

    public static void main(String[] args) {
        final int[][] DEFAULT_MATRIX = {
                {5, 9, 9, 8, 6},
                {4, 3, 0, 6, 4},
                {0, 1, 0, 1, 7},
                {9, 3, 5, 2, 0},
        };
        final int COLUMN_LENGTH = 4;
        int firstElement;
        int lastElement;

        boolean notMatch = true;
        for (int j = 1; j < COLUMN_LENGTH; j++) {
            if (j == 1 || j % 2 != 0) {
                firstElement = DEFAULT_MATRIX[0][j];
                lastElement = DEFAULT_MATRIX[COLUMN_LENGTH - 1][j];
                if (firstElement > lastElement) {
                    notMatch = false;
                    System.out.print("Column " + j + ": ");
                    for (int[] column : DEFAULT_MATRIX) {
                        System.out.print(column[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if (notMatch) {
            System.out.println("Nothing found.");
        }
    }

}
