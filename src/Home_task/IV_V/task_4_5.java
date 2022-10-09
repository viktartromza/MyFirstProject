package Home_task.IV_V;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_4_5 {// пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.

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
        int[] arrayreverse = new int[size];
        for (int i = 0; i < array.length; i++) {
            arrayreverse[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(arrayreverse));
    }
}