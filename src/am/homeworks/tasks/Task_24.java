package am.homeworks.tasks;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();
        boolean bool ;
        if(a == 2 && b == 2 || a == 2 && c == 2 || c == 2 && b == 2   ){
            bool  = true;
        }else {
            bool = false;
        }
        System.out.println(bool);
    }
}
