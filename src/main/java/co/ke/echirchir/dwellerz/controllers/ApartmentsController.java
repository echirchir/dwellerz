package co.ke.echirchir.dwellerz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
@RequestMapping("/apartments")
public class ApartmentsController{

    @GetMapping("/all")
    public String getAll(){

        return "apartments";
    }

    @GetMapping("/all/{id}")
    public String getApartmentById(@PathVariable("id") long id){

        return "apartment";
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