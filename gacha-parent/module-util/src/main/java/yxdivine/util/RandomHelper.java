package yxdivine.util;

import java.util.Random;

public class RandomHelper {
    private final Random random;

    public RandomHelper() {
        random = new Random();
    }

    public RandomHelper(int seed) {
        random = new Random(seed);
    }

    public int getRandom(int range) {
        return random.nextInt(range);
    }

    public int getRandom(int lb, int ub) {
        if (lb >= ub) return lb;
        int rand = random.nextInt(ub - lb);
        return lb + rand;
    }
}
