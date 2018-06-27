package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task24Boolean extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    public void calculateResult() {
        int[] array = getArrayNumbers();

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

    public    CheckNumber chekin(){
        return new Task24Boolean();
    }
}
