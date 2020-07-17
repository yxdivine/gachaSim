package yxdivine.gachaSim.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yxdivine.gachaSim.basic.RandomService;
import yxdivine.gachaSim.model.Banner;

@Component(StandardPullBanner.bannerId)
public class StandardPullBanner implements Banner {
    public static final String bannerId = "standard";

    @Autowired
    RandomService random;

    int[] chanceArray;

    public StandardPullBanner() {
        this.chanceArray = new int[]{2, 8, 50, 40};
    }

    public int pull() {
        int rand = random.random(100);
        return getPullResult(rand);
    }

    public int[] pull10() {
        int[] res = new int[10];
        for (int i = 0; i < 10; i++) {
            res[i] = getPullResult(random.random(100));
        }
        return res;
    }

    int getPullResult(int rand) {
        for (int i = 0; i < chanceArray.length; i++) {
            rand -= chanceArray[i];
            if (rand < 0) {
                return i;
            }
        }
        return chanceArray.length;
    }

    @Override
    public String getBannerId() {
        return "standard";
    }
}
