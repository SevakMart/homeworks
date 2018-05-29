package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ThreeDigitsSortReduction extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput((int) number.charAt(0), (int) number.charAt(1), (int) number.charAt(2));
        int[] sortedArray = sortArray(arraysThreeDigits);

        for (int i = sortedArray.length-1; i >= 0; i--) {
            System.out.println(sortedArray[i] - 48);
        }

    }

    public static void main(String[] args) {
        ThreeDigitsSortReduction threeDigitsSortReduction = new ThreeDigitsSortReduction();
        threeDigitsSortReduction.calculateResult();
    }
}

