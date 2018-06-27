package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task23Boolean extends DigitsGeneralsMethod implements CheckNumber,MethodName {
    public  void calculateResult(){

        int[] array =getArrayNumbers();

        for (int i = 0; i <array.length ; i++) {
            if(array[i] == 1){
                System.out.println(true);
                break;
            }else{
                System.out.println(false);
            }
        }

    }
    public    CheckNumber chekin(){
        return new Task23Boolean();
    }

}
