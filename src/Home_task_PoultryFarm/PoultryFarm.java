package Home_task_PoultryFarm;

import java.util.Arrays;
import java.util.Random;

public class PoultryFarm {
    public static void main(String[] args) {
        Hen[] hen = new Hen[100];
        String[] description = new String[100];

        for (int i = 0; i<100; i++){
            Random random = new Random();
            if (random.nextInt(100)<=25){
            hen[i] = new RussianHen();
                description[i] = RussianHen.getDescription;
            } else if (random.nextInt(100)<=50) {
                hen[i] = new UkrainianHen();
                description[i] = UkrainianHen.getDescription;
            } else if (random.nextInt(100)<=75){
                hen[i] = new MoldovanHen();
                description[i] = MoldovanHen.getDescription;} else{
                hen[i] = new BelarusianHen();
                description[i] = BelarusianHen.getDescription;
            }
            System.out.println(description[i]);
        }

        System.out.println("Всего за год снесено: " + (12*Hen.allCountOfEggsPerMonth) + " яиц!");
    }
}
