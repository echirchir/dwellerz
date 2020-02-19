package co.ke.echirchir.dwellerz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
@RequestMapping("/apartments")
public class ApartmentsController{

    @GetMapping("/all")
    public String getAll(){

        return "apartments";
    }

    @GetMapping("/{id}")
    public String getApartmentById(@RequestParam("id") long id){

        return "apartments";
    }

    @GetMapping("/create")
    public String showCreate(){

        return "create-apartment";
    }

    @PostMapping("/create")
    public String create(){

        return "aparments";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){

        return "apartments";
    }
}