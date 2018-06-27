package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

/**
 * Getting signed in numbers  sort Reduction
 */
public class SortReduction extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);
        for (int i = sortedArray.length - 1; i > 0; i--) {
            printResult("index" + i, sortedArray[i]);
        }

    }

    public    CheckNumber chekin(){
        return new SortReduction();
    }

}
