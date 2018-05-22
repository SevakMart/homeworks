package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * Accessed numbers checks the equality of one
 */
public class TwoNumbersEqualsTwo  extends DigitsGeneralsMethod {
    @Override
    public void  calculateResult() {

        int[] array = createArrayFromInput(5,7,6,8);
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == 1){
                printResult(true);
                break;
            }else{
                printResult(false);
            }
        }

    }

    public static void main(String[] args) {

       TwoNumbersEqualsTwo twoNumbersEqualsTwo = new TwoNumbersEqualsTwo();
       twoNumbersEqualsTwo.calculateResult();

    }
}
