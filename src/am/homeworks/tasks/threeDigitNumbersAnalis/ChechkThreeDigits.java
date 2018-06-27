package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

import java.util.Scanner;

public class ChechkThreeDigits extends GeneralsMethod implements CheckNumber,MethodName {
    public char f;

    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput(getStringNumber(number,0), getStringNumber(number,1), getStringNumber(number,2));
    
        if (arraysThreeDigits[0] + arraysThreeDigits[1] < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        printResult(f);
    }
    public    CheckNumber chekin(){
        return new ChechkThreeDigits();
    }

}
