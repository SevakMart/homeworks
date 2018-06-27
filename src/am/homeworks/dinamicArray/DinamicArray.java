package am.homeworks.dinamicArray;

public class DinamicArray implements ArrayMethod {

    private final int ENLARGE_SIZE = 15;
    private boolean checkSiz;
    private int size = 0;
    private int[] array;
    private int len;

    DinamicArray(int l) {

        len = l;
        array = new int[l];

    }

    DinamicArray(int... a) {

        array = a;

    }

    DinamicArray() {

        array = new int[10];

    }


    public void showArray() {

        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();

    }

    public void enlargeArrayLength() {

        int[] temp = new int[array.length + ENLARGE_SIZE];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;

    }


    public int get(int index) {

        return array[index];

    }

    public void set(int index, int elementy) {

        array[index] = elementy;
        showArray();

    }


    public void add(int addingIntejer) {

        if (size == array.length) {
            enlargeArrayLength();
        }
        array[size++] = addingIntejer;
        showArray();

    }

    public void remove(int removeNumber) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == removeNumber) {
                // i = 4, j= 5,
                for (int j = i + 1; j < array.length; j++) { // j=
                    array[j - 1] = array[j];
                }
            }
        }
        showArray();
        size--;
    }


    public void removeIndex(int index) {

        remove(get(index));

    }

    public boolean contains(int element) {

        for (int i : array) {
            if (i == element) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;

    }

    public int indexOf(int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(i);
                return i;

            }
        }
        System.out.println(-1);
        return -1;

    }

  public DinamicArray  subList(int startIndex,int endIndex){

      DinamicArray dinArr =new DinamicArray(endIndex-startIndex);
        for (int i = startIndex; i < endIndex ; i++) {
            dinArr.add(array[i]);
        }
        return dinArr;

  }
    public void  addAll(DinamicArray ar){

        for(int i:ar.array){
            add(i);
        }

    }

    public int size() {

        System.out.println(size);
        return size;

    }

}





