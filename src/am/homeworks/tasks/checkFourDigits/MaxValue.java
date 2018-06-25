package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

/**
 * Getting signed in numbers  max value
 */
public class MaxValue extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    @Override
    public void  calculateResult() {

        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);

        printResult("The max  value ", sortedArray[sortedArray.length - 1]);

    }
    public  CheckNumber chekin(){
        return new MaxValue();
    }

}
