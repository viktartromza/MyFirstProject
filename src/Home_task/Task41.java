package Home_task;

public class Task41 {
    public static void main(String[] args) {/*При помощи цикла for вывести на экран нечетные числа от 1 до 99. */
        for (int j = 1; j <= 99; j++) {
            System.out.print((j % 2 == 1) ? j : " ");
        }
    }
}
