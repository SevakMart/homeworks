package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task25Boolean extends DigitsGeneralsMethod {
    public void calculateResult() {
        int[] array = createArrayFromInput(5,7,6);
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

    public static void main(String[] args) {
        Task25Boolean task_25_boolean = new Task25Boolean();
        task_25_boolean.calculateResult();
    }
}
