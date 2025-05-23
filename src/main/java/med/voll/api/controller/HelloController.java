package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/opa")

public class HelloController {
    @GetMapping
    public String olaMundo(){
        return "Olá seja bem vindo a clinica medVoll";
    }
}
