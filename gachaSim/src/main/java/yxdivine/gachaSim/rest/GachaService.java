package yxdivine.gachaSim.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.gachaSim.basic.RandomHelper;

@RestController
public class GachaService {
    @Autowired
    RandomHelper random;

    @PostMapping(value = "/roll")
    public String roll() {
        return "hello world " + random.random(100);
    }
}
