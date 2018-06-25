package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task26matchNumber extends DigitsGeneralsMethod implements CheckNumber,MethodName {

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

    public    CheckNumber chekin(){
        return new Task26matchNumber();
    }
}
