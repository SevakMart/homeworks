package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task28GeometricProgression extends DigitsGeneralsMethod {
    public void calculateResult() {
        int[] array = createArrayFromInput(5,7,6);
        for (int i = 1; i < array.length; i++) {
            if (array[i + 2] / array[i + 1] == array[i + 1] / array[i]) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }


    }

    public static void main(String[] args) {
        Task28GeometricProgression task_28_geometricProgression = new Task28GeometricProgression();
        task_28_geometricProgression.calculateResult();
    }
}
