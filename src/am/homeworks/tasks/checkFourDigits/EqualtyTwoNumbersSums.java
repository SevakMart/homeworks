package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

/**
 * The numbers entered are checked by the numbers equal to the sum of two or two numbers
 */
public class EqualtyTwoNumbersSums extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        int[] array = getArrayNumbers();
        boolean bool = array[0] + array[1] == array[2] + array[3] ||
                array[0] + array[2] == array[1] + array[3] ||
                array[0] + array[3] == array[2] + array[1];

        if (bool) {
            printResult("y=1");
        } else {
            printResult("y=2");
        }

    }
    public    CheckNumber chekin(){
        return new EqualtyTwoNumbersSums();
    }

}
