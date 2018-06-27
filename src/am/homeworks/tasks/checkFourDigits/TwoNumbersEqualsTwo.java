package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

/**
 * Accessed numbers checks the equality of one
 */
public class TwoNumbersEqualsTwo  extends DigitsGeneralsMethod  implements CheckNumber,MethodName {
    @Override
    public void  calculateResult() {

        int[] array = getArrayNumbers();
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == 1){
                printResult(true);
                break;
            }else{
                printResult(false);
            }
        }

    }
   public    CheckNumber chekin(){
        return new TwoNumbersEqualsTwo();
    }

}
