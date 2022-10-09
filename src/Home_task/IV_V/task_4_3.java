package Home_task.IV_V;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_4_3 { // найти индекс минимального-максимального элементов и вывести
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
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexmax]) {
                indexmax = i;
            }
            if (array[i] < array[indexmin]) {
                indexmin = i;
            }
        }
        System.out.println("Индекс максимального элемента: " + indexmax);
        System.out.println("Индекс минимального элемента: " + indexmin);
    }
}
