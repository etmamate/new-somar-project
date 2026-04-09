package br.com.somar.backend_somar.DTO.Requests;

import br.com.somar.backend_somar.Enums.UsuarioEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UsuarioCreateRequestDTO {
    
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
    private String nome;

    @NotBlank(message = "Email é obrigatório")
    private String email;

    @NotBlank(message = "Senha é obrigatório")
    private String senha;

    @NotNull(message = "Tipo é obrigatório")
    /*@Pattern(regexp = "^(DOADOR|ONG|ADMIN)$", 
             message = "Tipo deve ser DOADOR, ONG ou ADMIN")*/
    private UsuarioEnum tipo;
}
