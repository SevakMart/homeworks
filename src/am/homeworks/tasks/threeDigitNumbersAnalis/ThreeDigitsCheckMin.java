package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

import java.util.Scanner;

public class ThreeDigitsCheckMin extends GeneralsMethod  implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput(getStringNumber(number, 0), getStringNumber(number, 1), getStringNumber(number, 2));
        int [] sortedArray = sortArray(arraysThreeDigits);
        printResult("This is min  value",getStringNumber(number,0));

    }

    public CheckNumber chekin(){
        return new Task21maxValue();
    }
}
