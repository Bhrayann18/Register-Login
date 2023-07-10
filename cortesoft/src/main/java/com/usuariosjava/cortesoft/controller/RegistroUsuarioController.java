package com.usuariosjava.cortesoft.controller;

import javax.persistence.PostRemove;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.usuariosjava.cortesoft.controller.dto.UsuarioRegistroDTO;
import com.usuariosjava.cortesoft.service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {

    private UsuarioService usuarioservice;

    public RegistroUsuarioController(UsuarioService usuarioservice) {
        this.usuarioservice = usuarioservice;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro() {
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
        usuarioservice.guardar(registroDTO);
        return "redirect:/registro?exito";
    }
}
