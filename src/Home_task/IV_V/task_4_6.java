package Home_task.IV_V;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_4_6 { //проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)
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
        boolean result = true;
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= a) {
                result = false;
                break;
            }
            a = array[i];
        }
        System.out.println("массив возрастающая последовательность: " + result);
    }
}
