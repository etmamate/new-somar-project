package br.com.somar.backend_somar.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.Models.Campanha;
import br.com.somar.backend_somar.Models.Ong;
import br.com.somar.backend_somar.Repository.CampanhaRepository;
import br.com.somar.backend_somar.Repository.OngRepository;

@Service
public class CampanhaService {
    private final OngRepository ongRepository;
    public final CampanhaRepository campanhaRepository;

    public CampanhaService(CampanhaRepository campanhaRepository, OngRepository ongRepository){
        this.campanhaRepository = campanhaRepository;
        this.ongRepository = ongRepository;
    }


    public Campanha salvarCampanha(CampanhaCreateRequestDTO campanhaCreateRequestDTO){
        Campanha campanha = new Campanha();
        campanha.setTitulo(campanhaCreateRequestDTO.getTitulo());
        campanha.setDescricao(campanhaCreateRequestDTO.getDescricao());
        // campanha.setOng(campanhaCreateRequestDTO.getCodong());
        Ong ong = ongRepository.findById(campanhaCreateRequestDTO.getCodong()).orElseThrow(() -> new RuntimeException("Ong não encontrada"));
        campanha.setOng(ong);
        campanha.setMeta(campanhaCreateRequestDTO.getMeta());
        campanha.setValoratual(campanhaCreateRequestDTO.getValoratual());
        campanha.setStatus(campanhaCreateRequestDTO.getStatus());
        return campanhaRepository.save(campanha);
    }

    public List<Campanha> listarCampanhas(){
        return campanhaRepository.findAll();
    }

    public void deletarCampanha(Long id){
        Campanha campanha = campanhaRepository.findById(id).orElseThrow(() -> new RuntimeException("Campanha não encontrada"));
        campanhaRepository.delete(campanha);
    }
}
