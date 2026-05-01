package br.com.somar.backend_somar.DTO.Requests;

import java.time.LocalDateTime;

import br.com.somar.backend_somar.Enums.CampanhaEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CampanhaUpdateRequestDTO {

    @NotBlank(message = "Titulo da campanha é obrigatório")
    private String titulo;

    @NotBlank(message = "Descrição da campanha é obrigatório")
    private String descricao;

    @Positive(message = "Meta da campanha precisa ser maior que zero")
    private float meta;

    @PositiveOrZero(message = "Valor atual não pode ser negativo")
    private float valoratual;

    @NotNull(message = "Data de finalização é obrigatória")
    private LocalDateTime diafinalizado;

    @NotNull(message = "Status é obrigatório")
    private CampanhaEnum status;
}
