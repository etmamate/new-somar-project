package br.com.somar.backend_somar.DTO.Responses;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OngResumoResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private String cidade;
    private String estado;
    private LocalDateTime datacriacao;
}
