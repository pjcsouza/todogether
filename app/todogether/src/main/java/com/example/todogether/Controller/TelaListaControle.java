package com.example.todogether.Controller;

import com.example.todogether.Model.Fachada;
import com.example.todogether.Model.Lista.Lista;
import com.example.todogether.Model.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TelaListaControle {

    @Autowired
    private Fachada fachada;

    @GetMapping("/mostrarListas")
    public String mostrarListas(Model model) {
        List<Lista> listas = fachada.consultarTodasListas(Usuario.atual.getId());
        model.addAttribute("listas", listas);
        return "tela_listas";
    }
}
