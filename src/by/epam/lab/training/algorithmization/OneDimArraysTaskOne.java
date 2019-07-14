package by.epam.lab.training.algorithmization;

import java.util.Scanner;

public class OneDimArraysTaskOne {

    /*
    2. Algorithmization

       Одномерные массивы

    1. В массив A [N] занесены натуральные числа.
       Найти сумму тех элементов, которые кратны данному К.
    */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final int[] DEFAULT_ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.print("Input a number K: ");
            int numberK = scanner.nextInt();
            int sum = 0;

            for (int currentElement : DEFAULT_ARRAY) {
                if (currentElement % numberK == 0) {
                    sum += currentElement;
                }
            }
            System.out.println(sum != 0 ? "sum = " + sum : "No array elements found.");
        }
    }

}
