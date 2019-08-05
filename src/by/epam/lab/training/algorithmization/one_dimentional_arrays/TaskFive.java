package by.epam.lab.training.algorithmization.one_dimentional_arrays;

public class TaskFive {

    /*
     2. Algorithmization

       Одномерные массивы

     5. Даны целые числа а 1 ,а 2  ,..., а n  .
        Вывести на печать только те числа, для которых аi > i.*/

    public static void main(String[] args) {
        final int[] DEFAULT_ARRAY = {-1, 3, 0, 0, 48, -668, 0, -2, 1000, -1};

        System.out.print("Elements: ");
        for (int i = 0; i < DEFAULT_ARRAY.length; i++) {
            int currentElement = DEFAULT_ARRAY[i];
            if (currentElement > i) {
                System.out.print(currentElement + " ");
            }
        }
    }

}
