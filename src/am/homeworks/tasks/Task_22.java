package am.homeworks.tasks;
import  java.util.Scanner;
public class Task_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();

        int sum = a+b+c;
        int min = a;
        if (min > a) {
            min = a;
        } else if (min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        }
        System.out.println(min);

    }
}
