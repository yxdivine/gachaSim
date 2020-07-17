package yxdivine.gachaSim.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.gachaSim.sims.arknights.ArknightsStandardBanner;
import yxdivine.gachaSim.basic.RandomService;

@RestController("/gacha")
public class GachaService {
    @Autowired
    RandomService random;
    @Autowired
    ArknightsStandardBanner akStd;

    @PostMapping(value = "/d100/pull")
    public int roll() {
        return random.random(100);
    }

    @PostMapping(value = "/ak/std/pull")
    public int[] akPull() {
        return akStd.pull10();
    }
}
