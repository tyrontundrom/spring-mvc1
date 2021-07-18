package pl.sda.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {

    @GetMapping("/hello")
    public String page() {
        return "hello";
    }
}
