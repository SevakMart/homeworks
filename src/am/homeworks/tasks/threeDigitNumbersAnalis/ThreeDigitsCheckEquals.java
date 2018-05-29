package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ThreeDigitsCheckEquals extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        if(number.charAt(0) == number.charAt(1) || number.charAt(2) == number.charAt(0) || number.charAt(2) == number.charAt(1)){
            printResult(true);
        }else{
            printResult(false);
        }

    }
    public static void main(String[] args) {

        ThreeDigitsCheckEquals threeDigitsCheckEquals = new ThreeDigitsCheckEquals();
        threeDigitsCheckEquals.calculateResult();

    }
}
