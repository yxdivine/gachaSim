package yxdivine.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yxdivine.util.RandomHelper;

import java.util.Map;

@RestController("/test")
public class TestService {
    public static final Logger logger = LoggerFactory.getLogger(TestService.class);
    @Autowired
    RandomHelper rand;

    @PostMapping("/test")
    public String test() {
        return "hello world" + rand.getRandom(1000);
    }

    @PostMapping("/json")
    public String json(@RequestBody Map<String, Object> body) {
        return "hello world" + body;
    }

}
