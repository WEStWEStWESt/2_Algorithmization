package by.epam.lab.training.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimArraysTaskEight {

    /*
      2. Algorithmization

        Одномерные массивы

      8. Дана последовательность целых чисел A1, A2 ..., An.
         Образовать новую последовательность, выбросив из
         исходной те члены, которые равны min(A1, A2 ..., An).*/

    public static void main(String[] args) {

        final int[] DEFAULT_ARRAY = {-1, -2, 0, 0, 6, 7, 7, -2, -2};
        int[] results;
        int resultsLength = 0;
        int resultsIndex = -1;
        int min = DEFAULT_ARRAY[0];

        for (int i = 1; i < DEFAULT_ARRAY.length; i++) {
            if (DEFAULT_ARRAY[i] < min) {
                min = DEFAULT_ARRAY[i];
            }
        }
        for (int currentElement : DEFAULT_ARRAY) {
            if (currentElement != min) {
                resultsLength++;
            }
        }
        results = new int[resultsLength];
        for (int currentElement : DEFAULT_ARRAY) {
            if (currentElement != min) {
                results[++resultsIndex] = currentElement;
            }
        }

        boolean replaced = resultsLength != 0;
        if (replaced) {
            System.out.println("The array before replacement: " + Arrays.toString(DEFAULT_ARRAY));
        }
        System.out.println(replaced ? "Replacements = " + Arrays.toString(results) : "No array elements replaced.");
    }

}
