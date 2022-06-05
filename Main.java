import java.util.*;

public class Main {

    public static void main(String[] args) {
        int win = 1;//win score
        int winChance = 74;//win chance percentage
        int range = 100;//100 test as limit in percentage
        int accuracy = 100;//Test run to increase accuracy(higher accuracy more accurate, max 1000000)
        
        double probWin = 0;
        double probAccu = 0;
        
        for (int i = 0; i < accuracy; i++) {
            for (int j = 0; j < range; j++) {
                Random rand = new Random();

                int randval = rand.nextInt(range);

                if (randval < winChance) {     //24% chance of win
                    win++;
                }
            }
            double rangeDouble = range;
            probWin = (win / rangeDouble);
            probAccu = +probWin;
        }
        double accuracyDouble = accuracy;
        probAccu = (probAccu / accuracy) * 100;
        System.out.println("Probability: " + probAccu + "%");
    }

}
