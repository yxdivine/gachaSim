package yxdivine.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.model.Fish;

import java.util.List;

@RestController("/moFish")
public class FishService {
    @Autowired
    List<Fish> fishList;

    @PostMapping("/testfish")
    public String test() {
        return fishList.toString();
    }
}
