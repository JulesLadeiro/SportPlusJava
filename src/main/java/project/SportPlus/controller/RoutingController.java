package project.SportPlus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoutingController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello from example 1");
        return "index";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("message", "Hello from example 2");
        return "index";
    }

    @GetMapping("/inscription")
    public String inscription(Model model) {
        model.addAttribute("message", "Hello from example 2");
        return "index";
    }
}
