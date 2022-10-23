package Home_task_PoultryFarm;

public class UkrainianHen extends Hen {
    final int COUNT_EGGS_MONTH_UKR = 10;
    public static String getDescription;

    public UkrainianHen() {
        getDescription = this.getDescription();
    }

    @Override
    int getCountOfEggsPerMonth() {
        return COUNT_EGGS_MONTH_UKR;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Украина. Я несу " + COUNT_EGGS_MONTH_UKR + " яиц в месяц.";
    }
}
