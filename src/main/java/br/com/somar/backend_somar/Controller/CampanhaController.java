package br.com.somar.backend_somar.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somar.backend_somar.DTO.Requests.CampanhaCreateRequestDTO;
import br.com.somar.backend_somar.Models.Campanha;
import br.com.somar.backend_somar.Service.CampanhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/campanha")
@RequiredArgsConstructor
public class CampanhaController {
    
    private final CampanhaService campanhaService;

    @PostMapping("/cadastrar")
    public Campanha createCampanha(@RequestBody CampanhaCreateRequestDTO campanhaCreateRequestDTO) {
        return campanhaService.salvarCampanha(campanhaCreateRequestDTO);
    }
    

}
