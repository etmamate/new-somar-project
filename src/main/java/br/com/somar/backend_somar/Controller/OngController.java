package br.com.somar.backend_somar.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somar.backend_somar.DTO.Requests.OngCreateRequestDTO;
import br.com.somar.backend_somar.Models.Ong;
import br.com.somar.backend_somar.Service.OngService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/ong")
@RequiredArgsConstructor
public class OngController {
    
    private final OngService ongService;

    @PostMapping("/cadastrar")
    public Ong createOng(@RequestBody OngCreateRequestDTO ongCreateRequestDTO) {
        return ongService.salvarOng(ongCreateRequestDTO);
    }
    
}
