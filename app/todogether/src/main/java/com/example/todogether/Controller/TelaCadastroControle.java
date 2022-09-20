package com.example.todogether.Controller;

import com.example.todogether.Model.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@Controller
public class TelaCadastroControle {

    @Autowired
    private Fachada fachada;

    @GetMapping("/cadastrarUsuario")
    public String cadastrarUsuario() {
        Boolean sucesso = fachada.cadastrarUsuario();
        return sucesso ? "redirect:/requestLogin" : "index";
    }

//    @GetMapping("/mostrarListaUsuarios")
//    public String mostrarListaUsuarios(Model model) {
//        System.out.println("Oi");
//        model.addAttribute("listaUsuarios", fachada.consultarTodosUsuarios());
//        return "lista_usuarios";
//    }
}
