package com.andersio.cadastro_usuario.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioRequestDTO {
    private String nome;
    private String email;
    private String senha;
}
