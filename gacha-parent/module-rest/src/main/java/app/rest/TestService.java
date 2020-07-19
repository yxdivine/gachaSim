package app.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestService {

    @PostMapping("/test")
    public String test() {
        return "hello world";
    }
}
