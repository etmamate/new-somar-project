package br.com.somar.backend_somar.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Requests.CampanhaUpdateRequestDTO;
import br.com.somar.backend_somar.DTO.Responses.CampanhaCreateResponseDTO;
import br.com.somar.backend_somar.DTO.Responses.CampanhaListResponseDTO;
import br.com.somar.backend_somar.Service.CampanhaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/campanha")
@RequiredArgsConstructor
public class CampanhaController {

    private final CampanhaService campanhaService;

    @PostMapping("/cadastrar")
    public CampanhaCreateResponseDTO createCampanha(@RequestBody CampanhaCreateRequestDTO campanhaCreateRequestDTO) {
        return campanhaService.salvarCampanha(campanhaCreateRequestDTO);
    }

    @GetMapping("/listar-campanhas")
    public List<CampanhaListResponseDTO> listarCampanhas() {
        return campanhaService.listarCampanhas();
    }

    @PutMapping("/{id}")
    public CampanhaCreateResponseDTO atualizarCampanha(@PathVariable Long id, @RequestBody CampanhaUpdateRequestDTO campanhaUpdateRequestDTO) {
        return campanhaService.atualizarCampanha(id, campanhaUpdateRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deletarCampanha(@RequestParam Long id){
        campanhaService.deletarCampanha(id);
    }
}
