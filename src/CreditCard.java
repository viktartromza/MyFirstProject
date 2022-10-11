public class CreditCard {
    int numberAccount;
    double amountAccount;

    double refill(double a) {
        amountAccount = amountAccount + a;
        return amountAccount;
    }

    double withdrawal(double a) {
        amountAccount = amountAccount - a;
        return amountAccount;
    }

    void showInfo() {
        System.out.println("Credit card number: " + numberAccount);
        System.out.println("Balanсe: " + amountAccount);
    }

    public CreditCard(int numberAccount, double amountAccount) {
        this.numberAccount = numberAccount;
        this.amountAccount = amountAccount;
    }

    public static class Main {
        public static void main(String[] args) {
           CreditCard card1 = new CreditCard(11111111, 1000.00);
           CreditCard card2 = new CreditCard(22222222, 5555.55);
           CreditCard card3 = new CreditCard(33333333, 10000.00);
           card1.refill(555.55);
           card2.refill(333.33);
           card3.withdrawal(0.01);
           card1.showInfo();
           card2.showInfo();
           card3.showInfo();
        } // Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
        // Тестовый сценарий для проверки:  Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.

    }
}
