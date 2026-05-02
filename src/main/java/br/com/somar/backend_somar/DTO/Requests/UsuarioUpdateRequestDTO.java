package br.com.somar.backend_somar.DTO.Requests;

import br.com.somar.backend_somar.Enums.UsuarioEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioUpdateRequestDTO {

    @NotBlank(message = "Nome e obrigatorio")
    @Size(min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
    private String nome;

    @NotBlank(message = "Email e obrigatorio")
    private String email;

    @NotBlank(message = "Senha e obrigatorio")
    private String senha;

    @NotNull(message = "Tipo e obrigatorio")
    private UsuarioEnum tipo;
}
