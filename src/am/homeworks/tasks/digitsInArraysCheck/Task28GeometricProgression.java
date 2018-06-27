package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task28GeometricProgression extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    public void calculateResult() {
        int[] array = getArrayNumbers();
        for (int i = 1; i < array.length; i++) {
            if (array[i + 2] / array[i + 1] == array[i + 1] / array[i]) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }

    public    CheckNumber chekin(){
        return new Task28GeometricProgression();
    }
}
