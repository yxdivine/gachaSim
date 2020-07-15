package yxdivine.gachaSim.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.gachaSim.basic.RandomService;

@RestController
public class GachaService {
    @Autowired
    RandomService random;

    @PostMapping(value = "/roll")
    public int roll() {
        return random.random(100);
    }
}
