package Home_task;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {/*Напишите программу, которая будет принимать на вход число и на выход будет
    выводить сообщение четное число или нет. Для определения четности числа используйте
    операцию получения остатка от деления (операция выглядит так: '% 2'). */
        for (; ; ) {
            System.out.println("введите число");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println((number % 2 == 0) ? "Число четное" : "Число нечетное");
        }
    }
}
