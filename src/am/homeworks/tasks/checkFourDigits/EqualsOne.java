package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class EqualsOne extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        int[] array = getArrayNumbers();
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                System.out.println(count);
                count++;
            }
        }
        if (count >= 2) {
            printResult(true);
        } else {
            printResult(false);
        }

    }

    public static void main(String[] args) {

        EqualsOne equalsOne = new EqualsOne();
        equalsOne.calculateResult();

    }
}
