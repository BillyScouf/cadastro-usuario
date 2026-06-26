package com.andersio.cadastro_usuario.controller;

import com.andersio.cadastro_usuario.dto.UsuarioResponseDTO;
import com.andersio.cadastro_usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    //endpoint
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UsuarioResponseDTO>> getAllUsers(){
        return usuarioService.getAllUsers();
    }
}
