package Home_task;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {/* Написать программу для вывода названия поры года по номеру
месяца. При решении используйте оператор if-else-if.*/
        for (; ; ) {
            System.out.println("введите номер месяца");
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            if (month <= 2 || month == 12) {
                System.out.println("ЗИМА");
            } else if (month <= 5) {
                System.out.println("ВЕСНА");
            } else if (month <= 8) {
                System.out.println("ЛЕТО");
            } else if (month <= 11) {
                System.out.println("ОСЕНЬ");
            } else
                System.out.println("Номер месяца может принимать значение от 1 до 12");
        }
    }
    }
