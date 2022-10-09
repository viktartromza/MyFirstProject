package Home_task.IV_V;

import java.util.Arrays;
import java.util.Scanner;

public class task_4_1 {//пройти по массиву, вывести все элементы в прямом и в обратном порядке

    public static void main(String[] args) {
        System.out.println("Введите размер массива (простое целое число)");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] arrayreverse = new int[size];
        for (int i = 0; i < array.length; i++) {
            arrayreverse[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(arrayreverse));
    }
}
