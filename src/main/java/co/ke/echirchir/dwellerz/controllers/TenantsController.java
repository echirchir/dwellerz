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
@RequestMapping("/tenants")
public class TenantsController{

    @GetMapping("/all")
    public String getAll(){

        return "tenants";
    }

    @GetMapping("/{id}")
    public String getTenantById(@PathVariable("id") long id){

        return "tenants";
    }

    @GetMapping("/create")
    public String showCreate(){

        return "create-tenant";
    }

    @PostMapping("/create")
    public String create(@RequestParam long id){

        return "apartments";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){

        return "apartments";
    }
}