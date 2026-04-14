package br.com.somar.backend_somar.DTO.Requests;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OngCreateRequestDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Descricao é obrigatório")
    private String descricao;
    @NotBlank(message = "Documento é obrigatório")
    private String documento;
    @NotBlank(message = "Telefone é obrigatório")
    private String telefone;
    @NotBlank(message = "Cidade é obrigatório")
    private String cidade;
    @NotBlank(message = "Estado é obrigatório")
    private String estado;
    @NotBlank(message = "codusuario é obrigatório")
    private Long codusuario;

    private LocalDateTime dataCriacao;
}
