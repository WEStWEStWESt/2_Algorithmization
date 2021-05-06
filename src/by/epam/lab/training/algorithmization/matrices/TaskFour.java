package by.epam.lab.training.algorithmization.matrices;

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

            while (size%2 !=0){
                System.out.print("Incorrect! Enter an even number: ");
                size = scanner.nextInt();
            }

            /*int[][] MATRIX = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {

                }
            }*/

        }
    }
}
