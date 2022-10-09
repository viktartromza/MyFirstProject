package Home_task.IV_V;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_4_4 { // найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет
    public static void main(String[] args) {
        System.out.println("Введите размер массива (простое целое число)");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        int zeroquantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroquantity += 1;
            }
        }
        if (zeroquantity == 0) {
            System.out.println("нет нулевых элементов");
        } else {
            System.out.println("количество нулевых элементов: " + zeroquantity);
        }
    }
}