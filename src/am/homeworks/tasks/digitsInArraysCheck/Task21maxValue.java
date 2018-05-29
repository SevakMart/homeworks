package am.homeworks.tasks.digitsInArraysCheck;


import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * Class calculate max value from array
 */
public class Task21maxValue extends DigitsGeneralsMethod {

    @Override
    public void  calculateResult() {

        int[] array = getArrayNumbers();

        int[] sortedArray = sortArray(array);

        printResult("The max  value ", sortedArray[sortedArray.length - 1]);

    }

    public static void main(String[] args) {

        Task21maxValue objectMax = new Task21maxValue();
        objectMax.calculateResult();

    }
}
