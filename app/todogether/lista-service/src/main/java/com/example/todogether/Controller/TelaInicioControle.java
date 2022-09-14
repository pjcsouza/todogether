package com.example.todogether.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaInicioControle {

    @GetMapping("/")
    public String mostrarTelaInicio() {
        return "index";
    }
}
