package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

import java.util.Scanner;

public class ThreeDigitsSumRelation extends GeneralsMethod   implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput(getStringNumber(number, 0), getStringNumber(number, 1), getStringNumber(number, 2));
        int sum = arraysThreeDigits[0] + arraysThreeDigits[1] + arraysThreeDigits[2];
        if (arraysThreeDigits[2] > arraysThreeDigits[1]) {
            printResult("This is relaction", Integer.parseInt(number) / sum);
        } else {
            printResult("This is Three-digits Number", Integer.parseInt(number));
        }

    }

    public    CheckNumber chekin(){
        return new ThreeDigitsSumRelation();
    }
}
