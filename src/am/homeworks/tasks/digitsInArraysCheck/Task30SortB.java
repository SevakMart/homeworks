package am.homeworks.tasks.digitsInArraysCheck;


import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task30SortB extends DigitsGeneralsMethod {
    public void calculateResult() {
        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);
        for (int i = array.length-1; i > 0; i--) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Task30SortB  task30SortB = new Task30SortB ();
        task30SortB.calculateResult();
    }
}
