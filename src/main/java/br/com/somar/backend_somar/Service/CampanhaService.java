package br.com.somar.backend_somar.Service;

import org.springframework.stereotype.Service;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.Models.Campanha;
import br.com.somar.backend_somar.Repository.CampanhaRepository;

@Service
public class CampanhaService {
    public final CampanhaRepository campanhaRepository;

    public CampanhaService(CampanhaRepository campanhaRepository){
        this.campanhaRepository = campanhaRepository;
    }


    public Campanha salvarCampanha(CampanhaCreateRequestDTO campanhaCreateRequestDTO){
        Campanha campanha = new Campanha();
        campanha.setTitulo(campanhaCreateRequestDTO.getTitulo());
        campanha.setDescricao(campanhaCreateRequestDTO.getDescricao());
        campanha.setOng(campanhaCreateRequestDTO.getCodong());
        campanha.setMeta(campanhaCreateRequestDTO.getMeta());
        campanha.setStatus(campanhaCreateRequestDTO.getStatus());
        return campanhaRepository.save(campanha);
    }
}
