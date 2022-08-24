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

    private Boolean validarEmail(String email) {
        String emailPattern = "^(.+)@(\\S+)$";
        return Pattern.compile(emailPattern)
                .matcher(email)
                .matches();
    }

    @GetMapping("/mostrarTelaCadastro")
    public String mostrarTelaCadastro() {
        return "tela_cadastro";
    }

    @RequestMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@RequestParam String email) {
        if(!validarEmail(email)) {
            return "tela_cadastro"; // mostrar erro
        }

        Boolean sucesso = fachada.cadastrarUsuario(email);
        return sucesso ? "redirect:/mostrarTelaLogin" : "tela_cadastro";
    }

    @GetMapping("/mostrarListaUsuarios")
    public String mostrarListaUsuarios(Model model) {
        System.out.println("Oi");
        model.addAttribute("listaUsuarios", fachada.consultarTodosUsuarios());
        return "lista_usuarios";
    }
}
