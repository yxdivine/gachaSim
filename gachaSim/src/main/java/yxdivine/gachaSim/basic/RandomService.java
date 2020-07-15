package yxdivine.gachaSim.basic;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService {

    public Random random = new Random();

    public int random(int range) {
        return random.nextInt(range);
    }
}
