package com.andersio.cadastro_usuario.service;

import com.andersio.cadastro_usuario.dto.UsuarioResponseDTO;
import com.andersio.cadastro_usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // all users
    public ResponseEntity<List<UsuarioResponseDTO>> getAllUsers() {

        try {
            var listIsEmpty = usuarioRepository.findAll();

            if (listIsEmpty.isEmpty()){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            List<UsuarioResponseDTO> users = usuarioRepository.findAll().stream()
                    .map(u -> new UsuarioResponseDTO(u.getEmail()))
                    .toList();

            return ResponseEntity.ok(users);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
