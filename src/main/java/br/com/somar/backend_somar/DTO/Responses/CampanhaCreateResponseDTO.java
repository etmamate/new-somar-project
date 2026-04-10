package br.com.somar.backend_somar.DTO.Responses;


import br.com.somar.backend_somar.Enums.CampanhaEnum;
import br.com.somar.backend_somar.Models.Ong;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CampanhaCreateResponseDTO {
	private Long id;
    private String titulo;
    private String descricao;
    private Ong codong;
    private float meta;
    private CampanhaEnum status;
}
