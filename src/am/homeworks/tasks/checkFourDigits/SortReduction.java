package am.homeworks.tasks.checkFourDigits;

import am.homeworks.tasks.DigitsGeneralsMethod;

/**
 * Getting signed in numbers  sort Reduction
 */
public class SortReduction extends DigitsGeneralsMethod {
    @Override
    public void calculateResult() {

        int[] array = createArrayFromInput(5,7,6,8);
        int[] sortedArray = sortArray(array);
        for (int i = sortedArray.length - 1; i > 0; i--) {
            printResult("index" + i, sortedArray[i]);
        }

    }

    public static void main(String[] args) {
        SortReduction sortReduction =new SortReduction();
        sortReduction.calculateResult();
    }

}
