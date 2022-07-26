package com.example.todogether.Controller;

import com.example.todogether.Model.Fachada;
import com.example.todogether.Model.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TelaLoginControle {

    @Autowired
    private Fachada fachada;

    @GetMapping("/requestLogin")
    public String requestLogin() {
        Boolean sucesso = fachada.requestLogin();

        if(!sucesso) return "tela_login";
        return  "redirect:/mostrarListas";
    }
}
