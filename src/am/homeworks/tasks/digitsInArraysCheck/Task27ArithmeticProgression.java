package am.homeworks.tasks.digitsInArraysCheck;

import am.homeworks.tasks.DigitsGeneralsMethod;

public class Task27ArithmeticProgression extends DigitsGeneralsMethod {
    public void calculateResult() {
        int[] array = getArrayNumbers();
        for (int i = 1; i <array.length ; i++) {
            if((array[i-1] +array[i+1])/2 == array[i]){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }



    }

    public static void main(String[] args) {
        Task27ArithmeticProgression task_27_arithmeticProgression = new Task27ArithmeticProgression();
        task_27_arithmeticProgression.calculateResult();
    }
}
