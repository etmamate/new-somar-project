package br.com.somar.backend_somar.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Requests.CampanhaUpdateRequestDTO;
import br.com.somar.backend_somar.DTO.Responses.CampanhaCreateResponseDTO;
import br.com.somar.backend_somar.DTO.Responses.CampanhaListResponseDTO;
import br.com.somar.backend_somar.Mapping.CampanhaMapper;
import br.com.somar.backend_somar.Models.Campanha;
import br.com.somar.backend_somar.Repository.CampanhaRepository;

@Service
public class CampanhaService {
    public final CampanhaRepository campanhaRepository;
    private final CampanhaMapper campanhaMapper;

    public CampanhaService(CampanhaRepository campanhaRepository, CampanhaMapper campanhaMapper){
        this.campanhaRepository = campanhaRepository;
        this.campanhaMapper = campanhaMapper;
    }

    public CampanhaCreateResponseDTO salvarCampanha(CampanhaCreateRequestDTO campanhaCreateRequestDTO){
        Campanha campanha = campanhaMapper.toEntity(campanhaCreateRequestDTO);
        campanha.setValoratual(campanhaCreateRequestDTO.getValoratual());
        Campanha campanhaSalva = campanhaRepository.save(campanha);
        return campanhaMapper.toCampanhaResponseDTO(campanhaSalva);
    }

    public List<CampanhaListResponseDTO> listarCampanhas(){
        return campanhaRepository.findAll()
            .stream()
            .map(campanhaMapper::toCampanhaListResponseDTO)
            .collect(Collectors.toList());
    }

    public CampanhaCreateResponseDTO atualizarCampanha(Long id, CampanhaUpdateRequestDTO campanhaUpdateRequestDTO){
        Campanha campanha = campanhaRepository.findById(id).orElseThrow(() -> new RuntimeException("Campanha nao encontrada"));
        campanha.setTitulo(campanhaUpdateRequestDTO.getTitulo());
        campanha.setDescricao(campanhaUpdateRequestDTO.getDescricao());
        campanha.setMeta(campanhaUpdateRequestDTO.getMeta());
        campanha.setValoratual(campanhaUpdateRequestDTO.getValoratual());
        campanha.setDiafinalizado(campanhaUpdateRequestDTO.getDiafinalizado());
        campanha.setStatus(campanhaUpdateRequestDTO.getStatus());
        Campanha campanhaAtualizada = campanhaRepository.save(campanha);
        return campanhaMapper.toCampanhaResponseDTO(campanhaAtualizada);
    }

    public void deletarCampanha(Long id){
        Campanha campanha = campanhaRepository.findById(id).orElseThrow(() -> new RuntimeException("Campanha nao encontrada"));
        campanhaRepository.delete(campanha);
    }
}
