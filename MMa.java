import java.util.Random;
import java.util.Scanner;

public class MMA {
    public static void main(String[] args) {
 /*       int x = 10;

        if (x == 5) {
            System.out.println(" х равен 5");
        } else {
            System.out.println(" х HE равен 5");
        }

        System.out.println((x == 5)?" х равен 5":" х HE равен 5");

//Switch старый
        switch ("Second") {
            case "first":
                System.out.println("Понедельник");
                break;
            case "second":
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Нет совпадений");
        }

//Switch от 16jdk
        switch ("Second") {
            case "first" -> System.out.println("Понедельник");
            case "second" -> System.out.println("Вторник");
            case "Hello" -> System.out.println("Среда");
            default -> System.out.println("Нет совпадений");
        }


        //вывести на экран цифры от 1 до 10 каждое на новой строке.

        //Циклы(всего 4): while doWhile for forEach
        int i = 1;

        //1. while
        while (i <= 100) {
            System.out.println(i++);
        }

        //2. do while
        do {
            System.out.println(i);
        } while (i <= 100);

        //если нужен бесконечный то можно передать true

//Используя while вывести все числа от 0 до 25 в одну строку через пробел.
        int x = 0;

        while (x <= 25) {
            System.out.print(x++ + " ");
        }


        // for( обьявления переменных ; условие ; i++)
        //если нужен бесконечный то можно ничего не передавать for(;;)
        // Используя for вывести каждое четное число от 2 до 20 включительно.
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // break - выход из цикла
        // continue - переход на следующую итерацию

        int x = 1;
        while (x < 10) {
            x++;
            if (x == 3) {
                continue;
            }
            System.out.println(x);
        }


        //Библиотека Math
        // abs(double value) - возвращает абсолютное значение для аргумента value
        // ceil(double value) - возвращает наименьшее целое число с плавающей точкой, которое не меньше value
        // floor(double d) - возвращает наибольшее целое число, которое не больше d
        // round(double d) - возвращает число d, округленное до ближайшего целого числа
        // log(double a) - возвращает натуральный логарифм числа a
        // max(double a, double b) - возвращает максимальное число из a и b
        // min(double a, double b) - возвращает минимальное число из a и b
        // pow(double a, double b) - возвращает число a, возведенное в степень b
        // random() - возвращает случайное число от 0.0 до 1.0
        // sqrt(double value) - возвращает квадратный корень числа value

        //System.out.println(Math.abs(-50));
        //System.out.println(Math.ceil(0.000001));
        //System.out.println(Math.floor(0.999999));
        //System.out.println(Math.round(0.7));
        //System.out.println(Math.log(5));
        //System.out.println(Math.max(5,5));
        //System.out.println(Math.min(6,5));
        //System.out.println(Math.pow(2,3.1));
        //System.out.println(Math.sqrt(16));
        //System.out.println(Math.random());

       //Scanner - то что позволяет считывать с клавиатуры
        //1. Создать
        Scanner scanner = new Scanner(System.in);

        //2.Используем
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Ваш возраст:" + age);
        System.out.println("Ваше имя:" + name);

        // System.out.println(scanner.nextLine()); - считывает всё
        // System.out.println(scanner.next()); - считывает до пробела


        //Ввести с консоли любое число. Если оно четное – вывести его в консоль.
        //Если нет - запросить число ещё раз.
        Scanner scanner = new Scanner(System.in);

        int x;
        do {
            x = scanner.nextInt();
        } while (x % 2 != 0);
*/

        int x = 5;
        int y = 10;
        // тут код
        y = y + x;
        x = y - x;
        y = y - x;

        System.out.println("x=" + x); //должен вывести x=10
        System.out.println("y=" + y); //должен вывести y=5
    }
}