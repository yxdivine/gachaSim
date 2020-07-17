package yxdivine.gachaSim;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yxdivine.gachaSim.basic.RandomService;
import yxdivine.gachaSim.sims.arknights.ArknightsStandardBanner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class AppTests {
    @Autowired
    RandomService random;
    @Autowired
    ArknightsStandardBanner akStd;

    @Test
    void basicRandomTest() throws Exception {
        int[] res = new int[100];
        for (int i = 0; i < 100000; i++) {
            res[random.random(100)]++;
        }
        System.out.println(Arrays.toString(res));
        if (res[0] == 0) {
            throw new Exception("no 0");
        }
    }

    @Test
    void rarityTest() {
        Map<String, Integer> pullRes = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            String rarity = akStd.decideRarity().toString();
            pullRes.putIfAbsent(rarity, 0);
            pullRes.put(rarity, pullRes.get(rarity) + 1);
        }
        System.out.println(pullRes);
    }
}
