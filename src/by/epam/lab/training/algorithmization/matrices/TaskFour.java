package by.epam.lab.training.algorithmization.matrices;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    /*
    2. Algorithmization

       Задачи. Массивы массивов

    4. Сформировать квадратную матрицу порядка n
         по заданному образцу(n - четное):
         | 1..2..3..4 .. n|
         | n..n-1..n-2.. 1|
         | 1..2..3..4 .. n|
         | ..  .. .. .. ..|
         | n..n-1..n-2.. 1|
    */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an even size of the matrix: ");
            int size = scanner.nextInt();

            while (size % 2 != 0 || size < 2) {
                System.out.print("Incorrect! Enter a positive even number>1 : ");
                size = scanner.nextInt();
            }
            //matrix[i][j]=(int) (Math.random() * (size-1) + 1);
            int[][] matrix = new int[size][size];
            int var = 0;
            int count = 0;
            for (int i = 0; i < size/2 ; ++var) {
                    for (int k = 0; k < size; k++) {
                        System.out.print("__");
                        System.out.print(matrix[i][k] = i + ++k);
                        --k;
                    }
                    System.out.println("");
                    for (int j = size; j > 0; --j) {
                        System.out.print("..");
                        System.out.print(matrix[--j][i] = j + ++i);
                        ++j;
                        --i;
                    }
                    System.out.println("");
                    i++;
                    var=--i;
                    count++;
                    if (count == size/2) break;
            }
            System.out.println("END");
        }
    }
}
