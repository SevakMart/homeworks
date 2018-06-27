package am.homeworks.tasks.threeDigitNumbersAnalis;

import am.homeworks.tasks.DigitsGeneralsMethod;

public abstract class GeneralsMethod extends DigitsGeneralsMethod {
    protected   int  getStringNumber(String number,int index){
        return (int)number.charAt(index)-DIFFERENCE_CHARACTER_TO_INTEGER;
    }

}
