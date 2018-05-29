package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class ThreeDigitsNumberCheck extends DigitsGeneralsMethod{
    @Override
    public void calculateResult() {

        String number =  getThreeDigitsNumber();
        int[] arraysThreeDigits = createArrayFromInput((int) number.charAt(0), (int) number.charAt(1), (int) number.charAt(2));
       int threeDigitsNumber = Integer.parseInt(number);
       if(threeDigitsNumber > 300){
           printResult("", arraysThreeDigits[0]/arraysThreeDigits[1]);
       }else {
           printResult("", arraysThreeDigits[1]/arraysThreeDigits[0]);
       }
    }

    public static void main(String[] args) {
        ThreeDigitsNumberCheck threeDigitsNumberCheck =  new ThreeDigitsNumberCheck();
        threeDigitsNumberCheck.calculateResult();
    }
}