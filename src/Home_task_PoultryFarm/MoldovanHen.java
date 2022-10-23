package Home_task_PoultryFarm;

public class MoldovanHen extends Hen{
    final int COUNT_EGGS_MONTH_MOL = 20;
    public static String getDescription;
    @Override
    int getCountOfEggsPerMonth() {
        return COUNT_EGGS_MONTH_MOL;
    }

    public MoldovanHen() {
        getDescription = this.getDescription();
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Молдова. Я несу " + COUNT_EGGS_MONTH_MOL + " яиц в месяц.";
    }
}
