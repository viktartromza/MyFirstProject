package Home_task;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) { /* Написать программу для вывода названия поры года по номеру
        месяца. При решении используйте оператор switch-case.*/
        for (; ; ) {
            System.out.println("введите номер месяца");
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            switch (month) {
                case (1):
                    System.out.println("январь");
                    break;
                case (2):
                    System.out.println("февраль");
                    break;
                case (3):
                    System.out.println("март");
                    break;
                case (4):
                    System.out.println("апрель");
                    break;
                case (5):
                    System.out.println("май");
                    break;
                case (6):
                    System.out.println("июнь");
                    break;
                case (7):
                    System.out.println("июль");
                    break;
                case (8):
                    System.out.println("август");
                    break;
                case (9):
                    System.out.println("сентябрь");
                    break;
                case (10):
                    System.out.println("октябрь");
                    break;
                case (11):
                    System.out.println("ноябрь");
                    break;
                case (12):
                    System.out.println("декабрь");
                    break;
                default:
                    System.out.println("Номер месяца может принимать значение от 1 до 12");
            }
        }
    }
}
