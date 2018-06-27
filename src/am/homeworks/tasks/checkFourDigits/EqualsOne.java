package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class EqualsOne extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    @Override
    public void calculateResult() {

        int[] array = getArrayNumbers();
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {

                count++;
            }
        }
        if (count >= 2) {
            System.out.println(count);
            printResult(true);
        } else {
            System.out.println(count);
            printResult(false);
        }

    }
   public    CheckNumber chekin(){
        return new EqualsOne();
 }

}
