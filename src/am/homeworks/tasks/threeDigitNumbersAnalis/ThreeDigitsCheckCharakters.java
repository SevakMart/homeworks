package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

import java.util.Scanner;

public class ThreeDigitsCheckCharakters extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        if((int)number.charAt(0)-48 == (int)number.charAt(1)-48 + (int)number.charAt(2)-48){
            printResult(true);
        }else{

            printResult(false);
        }

    }


    public static void main(String[] args) {
        ThreeDigitsCheckCharakters threeDigitsCheckCharakters = new ThreeDigitsCheckCharakters();
        threeDigitsCheckCharakters.calculateResult();
    }
}
