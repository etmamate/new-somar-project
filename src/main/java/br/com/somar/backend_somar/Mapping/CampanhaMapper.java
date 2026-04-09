package br.com.somar.backend_somar.Mapping;

import org.springframework.stereotype.Component;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Responses.CampanhaCreateResponseDTO;
import br.com.somar.backend_somar.Models.Campanha;

@Component
public class CampanhaMapper {
    
    public Campanha toEntity(CampanhaCreateRequestDTO dto){
        Campanha campanha = new Campanha();
        campanha.setTitulo(dto.getTitulo());
        campanha.setDescricao(dto.getDescricao());
        campanha.setOng(dto.getOng());
        campanha.setMeta(dto.getMeta());
        campanha.setStatus(dto.getStatus());
        return campanha;
    }

    public CampanhaCreateResponseDTO toCampanhaResponseDTO(Campanha campanha){
        return new CampanhaCreateResponseDTO(
            campanha.getTitulo(),
            campanha.getDescricao(),
            campanha.getOng(),
            campanha.getMeta(),
            campanha.getStatus()
        );
    }
}
