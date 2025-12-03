package es.iesclaradelrey.da2d1e.shopngprmnmp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; //que devuelva la mv de "index.html"
    }
}
