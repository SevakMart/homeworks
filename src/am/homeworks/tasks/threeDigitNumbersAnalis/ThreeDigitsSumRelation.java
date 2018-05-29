package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ThreeDigitsSumRelation extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput((int) number.charAt(0) - 48, (int) number.charAt(1) - 48, (int) number.charAt(2) - 48);
        int sum = arraysThreeDigits[0] + arraysThreeDigits[1] + arraysThreeDigits[2];
        if (arraysThreeDigits[2] > arraysThreeDigits[1]) {
            printResult("This is relaction", Integer.parseInt(number) / sum);
        } else {
            printResult("This is Three-digits Number", Integer.parseInt(number));
        }

    }

    public static void main(String[] args) {

        ThreeDigitsSumRelation threeDigitsSumRelation = new ThreeDigitsSumRelation();
        threeDigitsSumRelation.calculateResult();

    }
}
