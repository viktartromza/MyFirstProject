package Home_task;

public class Task44 {
    public static void main(String[] args) {/*Необходимо, чтоб программа выводила на экран вот такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
В решении используйте цикл while.*/
        int i = 7;
        while (i < 100) {
            System.out.print(i + " ");
            i += 7;
        }
    }
}
