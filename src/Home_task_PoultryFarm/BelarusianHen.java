package Home_task_PoultryFarm;

public class BelarusianHen extends Hen{
    final int COUNT_EGGS_MONTH_BLR = 25;
    public static String getDescription;
    @Override
    int getCountOfEggsPerMonth() {
        int countOfEggsPerMonth=COUNT_EGGS_MONTH_BLR;
        return countOfEggsPerMonth;
    }

    public BelarusianHen() {
        getDescription = this.getDescription();
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Молдова. Я несу " + COUNT_EGGS_MONTH_BLR + " яиц в месяц.";
    }
}
