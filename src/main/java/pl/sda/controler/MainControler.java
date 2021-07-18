package pl.sda.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class MainControler {

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }

    @PostMapping("/")
    public String buttonClick(Model model) {
        model.addAttribute("text", "Klieknięto");
        return "index";
    }

    @GetMapping("/main")
    public String main(Model model) {
        return "mainPage";
    }

    @PostMapping("/main/check")
    public String checkClientId(@ModelAttribute("clientId") String clientId, Model model) {

        List<String> clientIds = List.of("1000", "2000", "3000");
        boolean isClientExist = clientIds.contains(clientId);
        model.addAttribute("clientExists", isClientExist);
        model.addAttribute("clientId", clientId);
        return "mainPage";
    }

    @PostMapping("/main")
    public String forwardButtonClick(Model model) {
        return "index";
    }


    @PostMapping("/main2")
    public String redirectButtonClick(Model model) {
        return "redirect:";
    }


}
