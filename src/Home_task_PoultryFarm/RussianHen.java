package Home_task_PoultryFarm;

public class RussianHen extends Hen {
    public RussianHen() {
getDescription = this.getDescription();
    }

    public static String getDescription;
    final int COUNT_EGGS_MONTH_RUS = 5;

    @Override
    int getCountOfEggsPerMonth() {
        return COUNT_EGGS_MONTH_RUS;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Россия. Я несу " + COUNT_EGGS_MONTH_RUS + " яиц в месяц.";
    }
}
