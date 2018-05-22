package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * Getting signed in numbers  max value
 */
public class MaxValue extends DigitsGeneralsMethod {
    @Override
    public void  calculateResult() {

        int[] array = createArrayFromInput(5,7,6,8);
        int[] sortedArray = sortArray(array);

        printResult("The max  value ", sortedArray[sortedArray.length - 1]);

    }

    public static void main(String[] args) {
     MaxValue maxValue =new MaxValue();
     maxValue.calculateResult();
    }
}
