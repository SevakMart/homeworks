package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ThreeDigitsSortGrowing extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput((int) number.charAt(0), (int) number.charAt(1), (int) number.charAt(2));
        int[] sortedArray = sortArray(arraysThreeDigits);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] - 48);
        }
    }

    public static void main(String[] args) {
        ThreeDigitsSortGrowing threeDigitsSortGrowing = new ThreeDigitsSortGrowing();
        threeDigitsSortGrowing.calculateResult();
    }
}

