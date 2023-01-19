package com.iescomercio.lmsgi.services;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicesController {

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam String email, @RequestParam String pass){
        return "Usuario: "+email+"\n"+"pass: "+pass;
    }







}
