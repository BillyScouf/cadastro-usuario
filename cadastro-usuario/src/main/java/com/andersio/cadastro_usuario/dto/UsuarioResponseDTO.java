package com.andersio.cadastro_usuario.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioResponseDTO (@NotBlank @Email String email){}
