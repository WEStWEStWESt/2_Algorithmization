package by.epam.lab.training.algorithmization;

public class MatricesTaskOne {

    /*
    2. Algorithmization

       Задачи. Массивы массивов

    1. Дана матрица. Вывести на экран все нечетные столбцы,
       у которых первый элемент больше последнего.*/

    public static void main(String[] args) {
        final int[][] DEFAULT_MATRIX = {
                {5, 9, 9, 8, 6},
                {4, 3, 0, 6, 4},
                {0, 1, 0, 1, 7},
                {9, 3, 5, 2, 0},
                {0, 7, 2, 6, 0},
        };
        int firstElement;
        int lastElement;

        boolean notMatch = true;
        for (int j = 1; j < DEFAULT_MATRIX.length; j++) {
            if (j == 1 || j % 2 != 0) {
                firstElement = DEFAULT_MATRIX[0][j];
                lastElement = DEFAULT_MATRIX[DEFAULT_MATRIX.length - 1][j];
                if (firstElement > lastElement) {
                    notMatch = false;
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
