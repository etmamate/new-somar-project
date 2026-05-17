package br.com.somar.backend_somar.DTO.Responses;

import java.time.LocalDateTime;

import br.com.somar.backend_somar.Enums.CampanhaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CampanhaListResponseDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private OngResumoResponseDTO ong;
    private float meta;
    private float valoratual;
    private LocalDateTime datacriacao;
    private LocalDateTime diafinalizado;
    private CampanhaEnum status;
}
