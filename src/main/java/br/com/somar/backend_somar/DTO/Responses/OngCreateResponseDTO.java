package br.com.somar.backend_somar.DTO.Responses;

import java.time.LocalDateTime;

import br.com.somar.backend_somar.Models.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OngCreateResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private String documento;
    private String telefone;
    private String cidade;
    private String estado;
    private Usuario codusuario;
    private LocalDateTime dataCriacao;
}
