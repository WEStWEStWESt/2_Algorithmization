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
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter an even size of the matrix: ");
            int size = scanner.nextInt();

            while (size%2 !=0 || size < 2){
                System.out.print("Incorrect! Enter a positive even number>1 : ");
                size = scanner.nextInt();
            }
           //matrix[i][j]=(int) (Math.random() * (size-1) + 1);

            int[][] matrix = new int[size][size];
            //int col = 0, col2 = 0, row = 0, row2 =0;
            for (int i = 0; i <= size-1; i++) {
               // col = i+1;
                for (int j = 0; j <= size-1; j++) {
                    /*row = j+1;
                    matrix[col2][row2] = matrix[i][j];
                    col = row =0;*/
                }
            }

            for (int i = 0; i <= size-1; i++) {
                for (int j = 0; j <= size-1; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }
}
