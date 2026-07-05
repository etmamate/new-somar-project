package br.com.somar.backend_somar.DTO.Responses;

import br.com.somar.backend_somar.Enums.UsuarioEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private UsuarioEnum tipo;
}
