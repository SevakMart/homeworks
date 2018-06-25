package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.digitsInArraysCheck.Task21maxValue;

public class ThreeDigitsCheckMax extends GeneralsMethod  implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        String number = getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput(getStringNumber(number, 0), getStringNumber(number, 1), getStringNumber(number, 2));
        int[] sortedArray = sortArray(arraysThreeDigits);
        printResult("This is  max  value",getStringNumber(number,2));

    }

    public    CheckNumber chekin(){
        return new ThreeDigitsCheckMax();
    }
}
