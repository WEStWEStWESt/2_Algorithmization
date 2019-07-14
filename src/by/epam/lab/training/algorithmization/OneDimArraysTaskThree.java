package by.epam.lab.training.algorithmization;

public class OneDimArraysTaskThree {

    /*
     2. Algorithmization

       Одномерные массивы

     3. Дан массив действительных чисел, размерность которого N.
        Подсчитать, сколько в нем отрицательных,
        положительных и нулевых элементов.*/

    public static void main(String[] args) {
        final double[] DEFAULT_ARRAY = {-1, 2.3, 0, 0.4, 48, -668, 0, -2, 1000, -1};
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (double currentElement : DEFAULT_ARRAY) {
            if (currentElement < 0) {
                negativeCount++;
            }
            if (currentElement > 0) {
                positiveCount++;
            }
            if (currentElement == 0) {
                zeroCount++;
            }
        }
        System.out.println
                (
                        "Negative: "   + negativeCount +
                        "\nPositive: " + positiveCount +
                        "\nZero: "     + zeroCount
                );
    }

}
