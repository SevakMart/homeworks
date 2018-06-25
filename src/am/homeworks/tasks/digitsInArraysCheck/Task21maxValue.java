package am.homeworks.tasks.digitsInArraysCheck;


import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;
import am.homeworks.tasks.checkFourDigits.EqualsOne;

/**
 * Class calculate max value from array
 */
public class Task21maxValue extends DigitsGeneralsMethod implements CheckNumber,MethodName {

    @Override
    public void  calculateResult() {

        int[] array = getArrayNumbers();

        int[] sortedArray = sortArray(array);

        printResult("The max  value ", sortedArray[sortedArray.length - 1]);

    }

    public    CheckNumber chekin(){
        return new Task21maxValue();
    }
}
