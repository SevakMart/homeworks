package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task29SortA extends DigitsGeneralsMethod {
    public void calculateResult() {

        int[] array = createArrayFromInput(5,7,6);

        int[] sortedArray = sortArray(array);

        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    public static void main(String[] args) {
        Task29SortA task29sortA = new Task29SortA();
        task29sortA.calculateResult();
    }
}
