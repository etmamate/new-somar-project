package br.com.somar.backend_somar.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somar.backend_somar.DTO.Requests.OngCreateRequestDTO;
import br.com.somar.backend_somar.Models.Ong;
import br.com.somar.backend_somar.Service.OngService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value = "/ong")
@RequiredArgsConstructor
public class OngController {
    
    private final OngService ongService;

    @PostMapping("/cadastrar")
    public Ong createOng(@RequestBody OngCreateRequestDTO ongCreateRequestDTO) {
        return ongService.salvarOng(ongCreateRequestDTO);
    }

    @GetMapping("/listar-ongs")
    public List<Ong> listarOngs() {
        return ongService.listarOngs();
    }
    
    @GetMapping("/buscar-ong-{id}")
    public Optional<Ong> getMethodName(@RequestParam Long id) {
        return ongService.buscarOngId(id);
    }
    
}
