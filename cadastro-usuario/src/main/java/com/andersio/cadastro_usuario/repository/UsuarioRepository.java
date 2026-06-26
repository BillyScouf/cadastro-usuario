package com.andersio.cadastro_usuario.repository;

import com.andersio.cadastro_usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
