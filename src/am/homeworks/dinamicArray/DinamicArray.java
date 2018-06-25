package am.homeworks.dinamicArray;

public class DinamicArray implements ArrayMethod{
    private int size=0;
    private int [] array;
    private int  len;

    public void  showArray(){
        for (int i:array) {
            System.out.print(i+",");

        }
        System.out.println();
    }

    public void checkSize(){
        if(size == array.length) {
            int[] temp = new int[array.length + 15];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
    }

    public int get(int index){
        for (int i = 0; i <array.length ; i++) {
            if(i== index){
                i=index;
            }
        }
        return array[index];
    }




    public void add(int addingIntejer){
       checkSize();
       array[size++]=addingIntejer;
       showArray();
    }
    public  void  remove(int removeNumber){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==removeNumber){
                for (int j = i+1; j <array.length ; j++) {
                    array[j-1]=array[j];
                }
            }
        }
        showArray();
    }
    DinamicArray(int l){
        len = l;
        array = new int[l];

    }
    DinamicArray(int ... a){

        array = a;

    }
}
