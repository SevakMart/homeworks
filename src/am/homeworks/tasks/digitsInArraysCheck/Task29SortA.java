package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task29SortA extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    public void calculateResult() {

        int[] array = getArrayNumbers();

        int[] sortedArray = sortArray(array);

        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    public    CheckNumber chekin(){
        return new Task29SortA();
    }
}
