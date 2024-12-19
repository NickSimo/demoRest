package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/prova")
    public String demoApi() {
        return "demo prova hello pizza";
    }
}
