package am.homeworks.dinamicArray;

public class TestDinamicArray {
    public static void main(String[] args) {
        DinamicArray dinamicArray =new DinamicArray ();
        dinamicArray.add(5);
        dinamicArray.add(3);
        dinamicArray.add(7);
        dinamicArray.add(2);
        dinamicArray.add(8);
        dinamicArray.add(9);
        dinamicArray.add(4);

        dinamicArray.remove(3);
        dinamicArray.remove(9);
    }
}
