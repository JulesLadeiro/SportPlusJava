package project.SportPlus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.SportPlus.pojo.User;


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
        return "admin";
    }

    @GetMapping("/inscription")
    public String inscription(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "inscription";
    }

    @GetMapping("/connection")
    public String connection(Model model) {
        model.addAttribute("message", "Hello from example 2");
        return "index";
    }

    @GetMapping("/admin/addprod")
    public String addprod(Model model) {
        User  user = new User();
        model.addAttribute("message", "Hello from example 2");
        return "index";
    }

    @GetMapping("/productpage")
    public String productpage(Model model) {
        model.addAttribute("message", "Hello from example 2");
        return "index";
    }
}
