package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task25Boolean extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    public void calculateResult() {
        int[] array = getArrayNumbers();
        if(array.length == 3){

            if (array[0] + array[1] > array[2] || array[2] + array[1] > array[0]  || array[2] + array[0] > array[1] ) {
                System.out.println("y=1");
            } else {
                System.out.println("y=2");
            }
        }else{
            calculateResult();
        }



    }
    public    CheckNumber chekin(){
        return new Task25Boolean();
    }
}
