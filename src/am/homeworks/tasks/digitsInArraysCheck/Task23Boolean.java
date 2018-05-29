package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task23Boolean extends DigitsGeneralsMethod {
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

    public static void main(String[] args) {
        Task23Boolean task_23_boolean = new Task23Boolean();
        task_23_boolean.calculateResult();
    }
}
