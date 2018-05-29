package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task22minValue extends DigitsGeneralsMethod {
    public  void calculateResult(){

        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);

        printResult("The min  value ", sortedArray[0]);

    }

    public static void main(String[] args) {
        Task22minValue task_22_minValue = new Task22minValue();
        task_22_minValue.calculateResult();
    }
}
