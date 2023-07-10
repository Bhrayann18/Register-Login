package com.usuariosjava.cortesoft.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.usuariosjava.cortesoft.controller.dto.UsuarioRegistroDTO;
import com.usuariosjava.cortesoft.model.Usuario;

public interface UsuarioService extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    
    public List<Usuario> listarUsuarios();
}
