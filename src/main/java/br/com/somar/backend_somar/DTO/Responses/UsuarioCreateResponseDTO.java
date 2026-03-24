package br.com.somar.backend_somar.DTO.Responses;

import br.com.somar.backend_somar.Enums.UsuarioEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioCreateResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private UsuarioEnum tipo;
}

