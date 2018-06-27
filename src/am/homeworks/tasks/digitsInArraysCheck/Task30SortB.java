package am.homeworks.tasks.digitsInArraysCheck;


import am.homeworks.tasks.CheckNumber;
import am.homeworks.tasks.DigitsGeneralsMethod;
import am.homeworks.tasks.MethodName;

public class Task30SortB extends DigitsGeneralsMethod  implements CheckNumber,MethodName{
    public void calculateResult() {
        int[] array = getArrayNumbers();
        int[] sortedArray = sortArray(array);
        for (int i = array.length-1; i > 0; i--) {
            System.out.println(i);
        }

    }

    public    CheckNumber chekin(){
        return new Task30SortB();
    }
}
