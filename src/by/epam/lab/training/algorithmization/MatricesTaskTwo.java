package by.epam.lab.training.algorithmization;

public class MatricesTaskTwo {

    /*
    2. Algorithmization

       Задачи. Массивы массивов

    2. Дана квадратная матрица.
       Вывести на экран элементы, стоящие на диагонали.*/

    public static void main(String[] args) {
        final int[][] DEFAULT_MATRIX = {
                {5, 9, 9, 8, 6},
                {4, 3, 0, 6, 4},
                {0, 1, 0, 1, 7},
                {9, 3, 5, 2, 0},
                {6, 4, 7, 2, 1},
        };

        System.out.print("Main diagonal: ");
        for (int i = 0; i < DEFAULT_MATRIX.length; i++) {
            for (int j = 0; j < DEFAULT_MATRIX.length; j++) {
                if (i == j) {
                    System.out.print(DEFAULT_MATRIX[i][j] + " ");
                }
            }
        }

        System.out.print("\nSide diagonal: ");
        for (int i = 0; i < DEFAULT_MATRIX.length; i++) {
            for (int j = 0; j < DEFAULT_MATRIX.length; j++) {
                if (i + j == DEFAULT_MATRIX.length - 1) {
                    System.out.print(DEFAULT_MATRIX[i][j] + " ");
                }
            }
        }
    }

}
