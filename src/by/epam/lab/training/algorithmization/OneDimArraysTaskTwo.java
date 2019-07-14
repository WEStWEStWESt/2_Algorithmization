package by.epam.lab.training.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimArraysTaskTwo {
    /*
     2. Algorithmization

       Одномерные массивы

     2. Дана последовательность действительных чисел а 1 ,а 2  ,..., а п .
        Заменить все ее члены, большие данного Z, этим
        числом. Подсчитать количество замен.*/

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final int[] DEFAULT_ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.print("Input a number Z: ");
            int numberZ = scanner.nextInt();
            int count = 0;

            System.out.println("An initial array: " + Arrays.toString(DEFAULT_ARRAY));
            for (int i = 0; i < DEFAULT_ARRAY.length; i++) {
                if (DEFAULT_ARRAY[i] > numberZ) {
                    DEFAULT_ARRAY[i] = numberZ;
                    count++;
                }
            }
            boolean replaced = count != 0;
            if (replaced) {
                System.out.println("The array after replacement: " + Arrays.toString(DEFAULT_ARRAY));
            }
            System.out.println(replaced ? "Replacements = " + count : "No array elements replaced.");
        }
    }

}
