package br.com.somar.backend_somar.DTO.Responses;

import java.time.LocalDateTime;

import br.com.somar.backend_somar.Enums.CampanhaEnum;
import br.com.somar.backend_somar.Models.Ong;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CampanhaCreateResponseDTO {
    public CampanhaCreateResponseDTO(String titulo2, String descricao2, Ong ong2, float meta2, CampanhaEnum status2) {
		//TODO Auto-generated constructor stub
	}
	private Long id;
    private Ong ong;
    private String titulo;
    private String descricao;
    private float meta;
    private CampanhaEnum status;
    // private LocalDateTime diafinalizado;
}
