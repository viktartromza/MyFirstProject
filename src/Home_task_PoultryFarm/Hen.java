package Home_task_PoultryFarm;

public abstract class Hen {
    public static String getDescription;

    int getCountOfEggsPerMonth() {
        int countOfEggsPerMonth = 0;
        return countOfEggsPerMonth;
    }
    public static int allCountOfEggsPerMonth;
    public Hen() {
        Hen.allCountOfEggsPerMonth += getCountOfEggsPerMonth();
    }

    String getDescription() {
        return "Я курица.";
    }
}
