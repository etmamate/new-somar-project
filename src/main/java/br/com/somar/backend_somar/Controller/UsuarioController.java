package br.com.somar.backend_somar.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somar.backend_somar.DTO.Requests.UsuarioCreateRequestDTO;
import br.com.somar.backend_somar.Models.Usuario;
import br.com.somar.backend_somar.Service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/campanha")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioService usuarioService;
   

    //POST
    public Usuario postUsuario(UsuarioCreateRequestDTO usuarioCreateRequestDTO){
        return usuarioService.salvarUsuario(usuarioCreateRequestDTO);
    }   


}
