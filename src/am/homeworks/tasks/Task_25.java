package am.homeworks.tasks;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();

        if (a + b > c || c + b > a || c + a > b) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }
    }
}
