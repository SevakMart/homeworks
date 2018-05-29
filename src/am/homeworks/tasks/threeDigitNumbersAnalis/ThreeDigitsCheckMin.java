package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ThreeDigitsCheckMin extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int [] arraysThreeDigits=createArrayFromInput((int)number.charAt(0),(int)number.charAt(1),(int)number.charAt(2));
        int [] sortedArray = sortArray(arraysThreeDigits);
        System.out.println(sortedArray[0]-48);

    }

    public static void main(String[] args) {
       ThreeDigitsCheckMin threeDigitsCheckMin=new ThreeDigitsCheckMin();
        threeDigitsCheckMin.calculateResult();
    }
}
