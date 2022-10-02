package Home_task;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {/* Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.*/
        for (; ; ) {
            System.out.println("введите число");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int a = 0;
            for (int x = 1; x <= number; x++) {
                a = a + x;
            }
            System.out.println(a);}
    }
}
