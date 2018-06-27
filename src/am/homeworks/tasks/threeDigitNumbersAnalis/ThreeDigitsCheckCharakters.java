package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

import java.util.Scanner;

public class ThreeDigitsCheckCharakters extends GeneralsMethod  implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        if(getStringNumber(number,0) == getStringNumber(number,1) + getStringNumber(number,2)){
            printResult(true);
        }else{
            printResult(false);
        }

    }


    public    CheckNumber chekin(){
        return new ThreeDigitsCheckCharakters();
    }
}
