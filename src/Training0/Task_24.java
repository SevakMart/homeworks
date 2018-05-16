package Training;

public class Task_24 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 2;
        boolean bool ;
        if(a == 2 && b == 2 || a == 2 && c == 2 || c == 2 && b == 2   ){
            bool  = true;
        }else {
            bool = false;
        }
        System.out.println(bool);
    }
}
