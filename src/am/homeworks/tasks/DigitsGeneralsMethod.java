package am.homeworks.tasks;

import java.util.Scanner;

public abstract class DigitsGeneralsMethod {
    Scanner scanner = new Scanner(System.in);
    private static final int ARRAY_SIZE_FOR_THREE_NUMBERS_TASK = 3;
    private static final int ARRAY_SIZE_FOR_FOUR_NUMBERS_TASK = 4;
    protected final int DIFFERENCE_CHARACTER_TO_INTEGER = 48;





    protected String getThreeDigitsNumber(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber > 0 && firstNumber < 10 && secondNumber > 0 && secondNumber < 10 && thirdNumber > 0 && thirdNumber < 10) {
            return (Integer.toString(firstNumber) + Integer.toString(secondNumber) + Integer.toString(thirdNumber));
        } else {
            System.out.println("Recursion call");
            return getThreeDigitsNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }

    }

    ;

    protected  int[] getArrayNumbers() {


        System.out.println("Entered  size valuue");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;

    }



    protected int[] sortArray(final int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        return numbers;
    }

    protected void printResult(String message, int result) {
        System.out.println(message + ": " + result);
    }

    protected void printResult(String message) {
        System.out.println(message);
    }

    protected void printResult(boolean bool) {
        System.out.println(bool);
    }

    protected void printResult(char simbol) {
        System.out.println(simbol);
    }

    protected String  getThreeDigitsNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a three-digit number of three characters");
        String number = getThreeDigitsNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        return  number;
    }


    protected int[] createArrayFromInput(int firstNumber, int secondNumber, int thirdNumber) {
        int[] array = new int[ARRAY_SIZE_FOR_THREE_NUMBERS_TASK];
        array[0] = firstNumber;
        array[1] = secondNumber;
        array[2] = thirdNumber;
        return array;
    }

    protected int[] createArrayFromInput(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        int[] array = new int[ARRAY_SIZE_FOR_FOUR_NUMBERS_TASK];
        array[0] = firstNumber;
        array[1] = secondNumber;
        array[2] = thirdNumber;
        array[3] = fourthNumber;
        return array;
    }

    protected int[] createArrayFromInput(int... arrays) {

        printResult("The   arguments length", arrays.length);
        return arrays;

    }


}
