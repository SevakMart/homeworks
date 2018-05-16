package am.homeworks.tasks;
import java.util.Scanner;
public class Task_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();
        int max = a;
        if (max < a) {
            max = a;
        } else if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }
        System.out.println(max);
    }
}
