package am.homeworks.tasks;

import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b =scanner.nextInt(), c =scanner.nextInt();
        if (a < b && b < c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && c < b) {
            System.out.println(a + " " + c + " " + b);
        } else if(b < c && c < a){
            System.out.println(b + " " + c + " " + a);
        } else if(b < a && a < c){
            System.out.println(b + " " + c + " " + a);
        } else if(c < a && a < b){
            System.out.println(b + " " + c + " " + a);
        } else if(c < b && b < a){
            System.out.println(c + " " + b + " " + a);
        }


    }
}