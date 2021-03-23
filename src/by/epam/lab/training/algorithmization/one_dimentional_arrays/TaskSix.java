package by.epam.lab.training.algorithmization.one_dimentional_arrays;

public class TaskSix {

     /*
     2. Algorithmization

       Одномерные массивы

     6. Задана последовательность N вещественных чисел.
        Вычислить сумму чисел, порядковые номера которых
        являются простыми числами.
    */

    public static void main(String[] args) {
        final double[] DEFAULT_ARRAY = {0, 1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11};
        double sum = 0;

        for (int n = 2; n < DEFAULT_ARRAY.length; n++) {
            boolean simple = true;
            for (int i = 2; i < n; i++) {

                if ((n % i) == 0) {
                    simple = false;
                }
            }
            if (simple) {
                sum += DEFAULT_ARRAY[n];
            }
        }
        System.out.println("Sum = " + sum);
    }

}
