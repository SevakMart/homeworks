package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * Getting signed in numbers  sort Growing
 */
public class SortGrowing extends DigitsGeneralsMethod {
    @Override
    public void  calculateResult() {

        int[] array = createArrayFromInput(5,7,6,8);
        int[] sortedArray = sortArray(array);
        for (int i:sortedArray) {
            printResult("The index " + i + " value ", sortedArray[i]);
        }


    }

    public static void main(String[] args) {
        SortGrowing sortGrowing =new SortGrowing();
        sortGrowing.calculateResult();
    }
}
