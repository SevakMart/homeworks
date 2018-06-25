package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

/**
 * Getting signed in numbers  min value
 */

public class MinValue extends DigitsGeneralsMethod  implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        final int[] array = getArrayNumbers();
        final int[] sortedArray = sortArray(array);

        printResult("The min value ", sortedArray[0]);

    }
    public    CheckNumber chekin(){
        return new MinValue();
    }

}
