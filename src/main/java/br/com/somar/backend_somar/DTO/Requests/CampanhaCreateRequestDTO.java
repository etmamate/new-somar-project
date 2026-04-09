package br.com.somar.backend_somar.DTO.Requests;

import java.time.LocalDateTime;

import br.com.somar.backend_somar.Enums.CampanhaEnum;
import br.com.somar.backend_somar.Models.Ong;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CampanhaCreateRequestDTO {
    
    @NotBlank(message = "Id de Ong é obrigatório")
    private Ong ong;

    @NotBlank(message = "Titulo da campanha é obrigatório")
    private String titulo;

    @NotBlank(message = "Descrição da campanha é obrigatório")
    private String descricao;

    @NotBlank(message = "Meta da campanha é obrigatória")
    private float meta;
    
    @NotNull(message = "Tipo é obrigatório")
    private CampanhaEnum status;

//    private LocalDateTime diafinalizado;

}
