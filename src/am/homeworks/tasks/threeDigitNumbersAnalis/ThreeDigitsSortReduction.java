package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

import java.util.Scanner;

public class ThreeDigitsSortReduction extends GeneralsMethod   implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput(getStringNumber(number, 0), getStringNumber(number, 1), getStringNumber(number, 2));
        int[] sortedArray = sortArray(arraysThreeDigits);

        for (int i = sortedArray.length-1; i >= 0; i--) {
            System.out.println(sortedArray[i] - DIFFERENCE_CHARACTER_TO_INTEGER);
        }

    }

    public    CheckNumber chekin(){
        return new ThreeDigitsSortReduction();
    }
}

