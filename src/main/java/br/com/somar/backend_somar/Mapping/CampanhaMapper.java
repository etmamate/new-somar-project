package br.com.somar.backend_somar.Mapping;

import org.springframework.stereotype.Component;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Responses.CampanhaCreateResponseDTO;
import br.com.somar.backend_somar.Models.Campanha;
import br.com.somar.backend_somar.Repository.OngRepository;

@Component
public class CampanhaMapper {

    private final OngRepository ongRepository;

    public CampanhaMapper(OngRepository ongRepository){
        this.ongRepository = ongRepository;
    }
    
    public Campanha toEntity(CampanhaCreateRequestDTO dto){
        Campanha campanha = new Campanha();
        campanha.setTitulo(dto.getTitulo());
        campanha.setDescricao(dto.getDescricao());
        var ong = ongRepository.findById(dto.getCodong()).orElseThrow(() -> new RuntimeException("Ong não encontrada"));
        campanha.setOng(ong);
        campanha.setMeta(dto.getMeta());
        campanha.setValoratual(0f);
        campanha.setStatus(dto.getStatus());
        return campanha;
    }

    public CampanhaCreateResponseDTO toCampanhaResponseDTO(Campanha campanha){
        return new CampanhaCreateResponseDTO(
            campanha.getId(),
            campanha.getTitulo(),
            campanha.getDescricao(),
            campanha.getOng(),
            campanha.getMeta(),
            campanha.getValoratual(),
            campanha.getDatacriacao(), 
            campanha.getStatus()
        );
    }
}
