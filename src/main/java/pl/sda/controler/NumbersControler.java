package pl.sda.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NumbersControler {

    @GetMapping("/numbers/{myNumber}")
    public String page(@PathVariable long myNumber, Model model) {
        model.addAttribute("number","Wybrano" + myNumber);
        return "numbers";
    }
}
