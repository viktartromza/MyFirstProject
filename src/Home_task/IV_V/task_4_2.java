package Home_task.IV_V;

import java.util.Arrays;
import java.util.Scanner;

public class task_4_2 { // найти минимальный-максимальный элементы и вывести
    public static void main(String[] args) {
        System.out.println("Введите размер массива (простое целое число)");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите любое целое число");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("min value " + array[0]);
        System.out.println("max value " + array[size - 1]);
    }
}
