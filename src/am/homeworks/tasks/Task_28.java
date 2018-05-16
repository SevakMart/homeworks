package am.homeworks.tasks;

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();
            boolean bool ;
            if(c/b == b/a ){
                bool = true;
            }else {
                bool = false;
            }
            System.out.println(bool);

    }
}
