package yxdivine.gachaSim.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.gachaSim.basic.RandomService;

@RestController("/banner1")
public class SimplePullBanner {
    @Autowired
    RandomService random;

    int[] chanceArray;

    public SimplePullBanner() {
        this.chanceArray = new int[]{2, 8, 50, 40};
    }

    @PostMapping("/pull")
    public int pull() {
        int rand = random.random(100);
        return getPullResult(rand);
    }

    @PostMapping("/pull10")
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
}
