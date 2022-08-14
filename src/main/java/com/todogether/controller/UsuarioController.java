package com.todogether.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todogether.entity.Usuario;
import com.todogether.form.UsuarioForm;
import com.todogether.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImpl service;
	
	@GetMapping
	public List<Usuario> getAll(@RequestParam(value = "nome", required = false) String nome) {
		return service.getAll(nome);
	}
	
	@PostMapping
	public Usuario create(@Valid @RequestBody UsuarioForm form) {
		return service.create(form);
	}

}
