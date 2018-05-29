package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task26matchNumber extends DigitsGeneralsMethod {

    public void calculateResult() {

        int[] array = getArrayNumbers();
       // int[] sortedArray = sortArray(array);

        for (int anArray : array) {
            if (anArray % 2 == 0) {
                System.out.println(true);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Task26matchNumber task_26_matchNumber =new Task26matchNumber();
        task_26_matchNumber.calculateResult();
    }
}
