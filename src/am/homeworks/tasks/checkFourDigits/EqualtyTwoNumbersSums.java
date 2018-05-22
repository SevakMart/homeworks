package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * The numbers entered are checked by the numbers equal to the sum of two or two numbers
 */
public class EqualtyTwoNumbersSums extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        int[] array = createArrayFromInput(5,7,6,8);
        boolean bool = array[0] + array[1] == array[2] + array[3] ||
                array[0] + array[2] == array[1] + array[3] ||
                array[0] + array[3] == array[2] + array[1];

        if (bool) {
            printResult("y=1");
        } else {
            printResult("y=2");
        }

    }

    public static void main(String[] args) {

        EqualtyTwoNumbersSums equaltyTwoNumbersSums = new EqualtyTwoNumbersSums();
        equaltyTwoNumbersSums.calculateResult();

    }
}
