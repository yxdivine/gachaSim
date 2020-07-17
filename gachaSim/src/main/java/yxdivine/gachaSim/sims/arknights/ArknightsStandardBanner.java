package yxdivine.gachaSim.sims.arknights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yxdivine.gachaSim.basic.RandomService;

@Component
public class ArknightsStandardBanner {
    public static final String bannerId = "ak_standard";

    public static int upRate = 70;

    final int[] chanceArray = new int[]{200, 800, 5000, 4000};
    final int total = 10000;
    @Autowired
    RandomService random;


    public int pull() {
        return 0;
    }

    public int[] pull10() {
        int[] res = new int[10];
        for (int i = 0; i < 10; i++) {
            res[i] = 0;
        }
        return res;
    }


    public Rarity decideRarity() {
        int rand = random.random(total);
        int index = 0;
        for (; index < chanceArray.length - 1; index++) {
            rand -= chanceArray[index];
            if (rand < 0) {
                break;
            }
        }
        return Rarity.values()[index];
    }


}
