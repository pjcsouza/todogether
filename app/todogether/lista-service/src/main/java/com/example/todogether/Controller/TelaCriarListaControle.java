package com.example.todogether.Controller;

import com.example.todogether.Model.Fachada;
import com.example.todogether.Model.Lista.Lista;
import com.example.todogether.Model.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TelaCriarListaControle {

    @Autowired
    private Fachada fachada;

    @GetMapping("/mostrarFormNovaLista")
    public String mostrarFormNovaLista() {
        return "nova_lista";
    }

    @RequestMapping("/criarLista")
    public String criarLista(@RequestParam String nome) {
        fachada.criarLista(nome, Usuario.atual.getId());
        return  "redirect:/mostrarListas";
    }
}
