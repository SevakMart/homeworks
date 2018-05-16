package am.homeworks.tasks;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();
        int bool ;
        if(a % 2 == 0 || b % 2 == 0 || c % 2 == 0 ){
            bool = 1;
        }else {
            bool = 2;
        }
        System.out.println(bool);

    }
}
