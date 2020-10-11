package yxdivine.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.model.Fish;
import yxdivine.util.RandomHelper;

import java.util.List;

@RestController("/moFish")
public class FishService {
    @Autowired
    List<Fish> fishList;
    @Autowired
    RandomHelper rand;

    @PostMapping("/singleMo")
    public Fish test() {
        return fishList.get(rand.getRandom(fishList.size()));
    }
}
