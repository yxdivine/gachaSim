package yxdivine.gachaSim.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GachaService {
    @PostMapping(value = "/test")
    public String test() {
        return "hello world";
    }
}
