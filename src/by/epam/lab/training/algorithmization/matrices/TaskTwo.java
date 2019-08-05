package by.epam.lab.training.algorithmization.matrices;

public class TaskTwo {

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
        printDiagonal(true, DEFAULT_MATRIX.length, DEFAULT_MATRIX);
        printDiagonal(false, DEFAULT_MATRIX.length, DEFAULT_MATRIX);
    }

    private static void printDiagonal(boolean main, int length, int[][] matrix) {
        System.out.print(main ? "Main diagonal: " : "\nSide diagonal: ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (getCondition(i, j, length, main)) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    private static boolean getCondition(int i, int j, int length, boolean main) {
        return main ? (i == j) : (i + j == length - 1);
    }

}
