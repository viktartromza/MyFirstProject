package Home_task;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {/*Для введенного числа t (температура на улице) вывести:
Если t>–5, то вывести «Тепло». Если –5>= t > –20, то вывести «Нормально». Если –20>= t, то вывести «Холодно».
*/
        for (; ; ) {
            System.out.println("введите число");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Тепло");
            } else {
                if (t <= -20) {
                    System.out.println("Холодно");
                } else {
                    System.out.println("Нормально");
                }
            }
        }
    }
}
