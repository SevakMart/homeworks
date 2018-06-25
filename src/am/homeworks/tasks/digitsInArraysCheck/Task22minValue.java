package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task22minValue extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    public  void calculateResult(){

        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);
        printResult("The min  value ", sortedArray[0]);

    }

    public    CheckNumber chekin(){
        return new Task22minValue();
    }
}
