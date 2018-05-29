package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ChechkThreeDigits extends DigitsGeneralsMethod {
    public char f;

    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput((int) number.charAt(0) - 48, (int) number.charAt(1) - 48, (int) number.charAt(2) - 48);
        int sum = arraysThreeDigits[0] + arraysThreeDigits[1] + arraysThreeDigits[2];
        if (arraysThreeDigits[0] + arraysThreeDigits[1] < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        printResult(f);
    }

    public static void main(String[] args) {
        ChechkThreeDigits chechkThreeDigits = new ChechkThreeDigits();
        chechkThreeDigits.calculateResult();
    }
}
