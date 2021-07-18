package pl.sda.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class ErrorController {

    @PostMapping("/error-test")
    public String view() {

        int randomNumber = new Random().nextInt(2);
        if (randomNumber == 1) {
            throw new NullPointerException();
        }
        return "no-error";
    }

    @ExceptionHandler
    public String errorPage() {
        return "error";
    }

}
