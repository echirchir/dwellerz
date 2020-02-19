package co.ke.echirchir.dwellerz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController{

    @GetMapping("/")
    public String home(){

        return "home";
    }

    @GetMapping("/about-us")
    public String about(){

        return "about-us";
    }

    @GetMapping("/contact-us")
    public String contact(){

        return "contact-us";
    }

    @GetMapping("/locations/all")
    public String locations(){

        return "locations";
    }

    @GetMapping("/careers")
    public String careers(){

        return "careers";
    }

    @GetMapping("/blog")
    public String blog(){

        return "blog";
    }

}