package yxdivine.gachaSim;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yxdivine.gachaSim.basic.RandomService;

import java.util.Arrays;

@SpringBootTest
class AppTests {
    @Autowired
    RandomService random;

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
}
