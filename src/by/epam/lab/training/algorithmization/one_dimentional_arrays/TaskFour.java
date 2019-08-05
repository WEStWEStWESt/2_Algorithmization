package by.epam.lab.training.algorithmization.one_dimentional_arrays;

import java.util.Arrays;

public class TaskFour {

    /*
     2. Algorithmization

       Одномерные массивы

     4. Даны действительные числа а 1 ,а 2 ,..., а n  .
        Поменять местами наибольший и наименьший элементы.*/

    public static void main(String[] args) {
        final double[] DEFAULT_ARRAY = {-1, 2.3, 0, 0.4, 48, -668, 0, -2, 1000, -1};
        double min = DEFAULT_ARRAY[0];
        double max = DEFAULT_ARRAY[0];
        int indexMin = 0;
        int indexMax = 0;
        double tmp = 0;

        for (int i = 0; i < DEFAULT_ARRAY.length; i++) {
            double currentElement = DEFAULT_ARRAY[i];
            if (currentElement < min) {
                min = currentElement;
                indexMin = i;
            }
            if (currentElement > max) {
                max = currentElement;
                indexMax = i;
            }
        }

        System.out.println("An initial array: " + Arrays.toString(DEFAULT_ARRAY));

        tmp = DEFAULT_ARRAY[indexMin];
        DEFAULT_ARRAY[indexMin] = DEFAULT_ARRAY[indexMax];
        DEFAULT_ARRAY[indexMax] = tmp;

        System.out.println("The array after replacement: " + Arrays.toString(DEFAULT_ARRAY));
    }

}
