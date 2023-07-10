package com.usuariosjava.cortesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.usuariosjava.cortesoft.service.UsuarioService;

@Controller
public class RegistroController {

    @Autowired
	private UsuarioService service;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", service.listarUsuarios());
		return "index";
	}

}
