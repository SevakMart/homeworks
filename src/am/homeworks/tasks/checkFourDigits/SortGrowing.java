package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

/**
 * Getting signed in numbers  sort Growing
 */
public class SortGrowing extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    @Override
    public void  calculateResult() {

        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);
        for (int i:sortedArray) {
            printResult("The index " + i + " value ", sortedArray[i]);
        }


    }
    public    CheckNumber chekin(){
        return new SortGrowing();
    }

}
