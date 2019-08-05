package by.epam.lab.training.algorithmization.one_dimentional_arrays;

import java.util.Arrays;

public class TaskTen {

    /*
      2. Algorithmization

        Одномерные массивы

       10. Дан целочисленный массив с количеством элементов N.
          Сжать массив, выбросив из него каждый второй элемент
          (освободившиеся элементы заполнить нулями).
          Примечание. Дополнительный массив не использовать.*/

    public static void main(String[] args) {
        final int[] DEFAULT_ARRAY = {1, 8, 3, 5, 7, 7, -2, -2};

        System.out.println("An initial array: " + Arrays.toString(DEFAULT_ARRAY));
        System.out.print("Result: ");
        for (int i = 0; i < DEFAULT_ARRAY.length; i++) {
            if (i == 1 || i % 2 != 0) {
                System.out.print((DEFAULT_ARRAY[i] = 0) + " ");
            } else System.out.print((DEFAULT_ARRAY[i]) + " ");
        }
    }

}
