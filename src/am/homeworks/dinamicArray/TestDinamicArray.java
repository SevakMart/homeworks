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
        dinamicArray.size();
//        dinamicArray.remove(3);
//        dinamicArray.remove(9);
//        dinamicArray.removeIndex(1);
//        dinamicArray.set(1,58);
//        dinamicArray.contains(59);
//        dinamicArray.indexOf(45);
     //
dinamicArray.addAll(new DinamicArray(1,2));
        dinamicArray.size();
        dinamicArray.removeIndex(3);
        dinamicArray.size();
    }
}
