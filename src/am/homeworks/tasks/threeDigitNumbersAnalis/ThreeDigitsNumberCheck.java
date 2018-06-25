package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

public class ThreeDigitsNumberCheck extends GeneralsMethod   implements CheckNumber,MethodName{
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput(getStringNumber(number, 0), getStringNumber(number, 1), getStringNumber(number, 2));
       int threeDigitsNumber = Integer.parseInt(number);
       if(threeDigitsNumber > 300){
           printResult("", arraysThreeDigits[0]/arraysThreeDigits[1]);
       }else {
           printResult("", arraysThreeDigits[1]/arraysThreeDigits[0]);
       }
    }

    public    CheckNumber chekin(){
        return new ThreeDigitsNumberCheck();
    }
}