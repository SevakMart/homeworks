package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * Getting signed in numbers  min value
 */

public class MinValue extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        final int[] array = createArrayFromInput(5,7,6,8);
        final int[] sortedArray = sortArray(array);

        printResult("The min value ", sortedArray[0]);

    }

    public static void main(String[] args) {

        MinValue minValue = new MinValue();
        minValue.calculateResult();

    }
}
