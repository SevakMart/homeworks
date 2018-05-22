package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task24Boolean extends DigitsGeneralsMethod {
    public void calculateResult() {
        int[] array = createArrayFromInput(5,7,6);

        int count = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                System.out.println(count);
                count++;
            }
        }
        if (count >= 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {
        Task24Boolean task_24_boolean = new Task24Boolean();
        task_24_boolean.calculateResult();
    }
}
