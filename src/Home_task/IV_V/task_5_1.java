package Home_task.IV_V;

import java.util.Random;
import java.util.Scanner;

public class task_5_1 { // Создать двумерный массив, заполнить его числами. Добавить к каждому значению число, которое пользователь будет вводить с консоли. Найти сумму всех получившихся элементов.
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите число:");
        int increase = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += increase;
                sum = sum + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
