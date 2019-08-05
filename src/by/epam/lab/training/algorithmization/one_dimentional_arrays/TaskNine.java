package by.epam.lab.training.algorithmization.one_dimentional_arrays;

import java.util.Arrays;

public class TaskNine {

    /*
      2. Algorithmization

        Одномерные массивы

      9. В массиве целых чисел, с количеством элементов n,
         найти наиболее часто встречающееся число.
         Если таких чисел несколько, то определить наименьшее из них. */

    public static void main(String[] args) {
        final int[] DEFAULT_ARRAY = {1, 8, -6, -6, -6, 0, 0, 0, -2, -2};
        final int DEFAULT_LENGTH = DEFAULT_ARRAY.length;
        int previousIndex = -1;
        int repetitionsCounter = 0;

        Integer[] duplicates = new Integer[DEFAULT_LENGTH];
        int[] repetitions = new int[DEFAULT_LENGTH];
        int index = 0;

        for (int currentElement : DEFAULT_ARRAY) {
            for (int repeatableElement : DEFAULT_ARRAY) {
                if (currentElement == repeatableElement) {
                    repetitionsCounter++;
                }
            }
            if (repetitionsCounter == 1) {
                repetitionsCounter = 0;
            }
            if (repetitionsCounter > 1) {
                boolean duplicated = false;
                for (int k = 0; k < DEFAULT_LENGTH; k++) {
                    if (duplicates[k] != null && duplicates[k].equals(currentElement)) {
                        duplicated = true;
                        index = k;
                        break;
                    }
                }
                index = duplicated ? index : ++previousIndex;
                repetitions[index] = ++repetitions[index];
                duplicates[index] = currentElement;
                repetitionsCounter = 0;
            }
        }
        int repetitionMax = repetitions[0];
        for (int repetition : repetitions) {
            if (repetition == 0) break;
            if (repetition > repetitionMax) {
                repetitionMax = repetition;
            }
        }
        repetitionsCounter = 0;
        for (int repetition : repetitions) {
            if (repetition == repetitionMax) {
                repetitionsCounter++;
            }
        }
        int resultIndex = -1;
        int[] results = new int[repetitionsCounter];
        for (int i = 0; i < DEFAULT_LENGTH; i++) {
            if (repetitions[i] == 0) break;
            if (repetitions[i] >= repetitionMax) {
                results[++resultIndex] = duplicates[i];
            }
        }
        int resultMin = results[0];
        for (int result : results) {
            if (result == 0) break;
            if (result < resultMin) {
                resultMin = result;
            }
        }
        boolean multipleResults = results.length > 1;
        System.out.println("An initial array: " + Arrays.toString(DEFAULT_ARRAY));
        System.out.println(multipleResults ? "Min result: " + resultMin : "The most repeatable number: " + results[0]);
    }

}
