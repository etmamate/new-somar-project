package br.com.somar.backend_somar.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.somar.backend_somar.DTO.Requests.LoginRequest;
import br.com.somar.backend_somar.DTO.Requests.UsuarioCreateRequestDTO;
import br.com.somar.backend_somar.Models.Usuario;
import br.com.somar.backend_somar.Service.UsuarioService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    //POST
    @PostMapping("/cadastrar")
    public Usuario postUsuario(@RequestBody UsuarioCreateRequestDTO usuarioCreateRequestDTO){
        return usuarioService.salvarUsuario(usuarioCreateRequestDTO);
    }   

    @GetMapping("/listar-usuarios")
    public List<Usuario> listarUsuarios () {
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@RequestParam Long id){
        usuarioService.deletarUsuario(id);
    }

    @PostMapping("/login")
    public String logarUsuario(@RequestBody LoginRequest loginRequest) {
        return usuarioService.logarUsuario(loginRequest.getEmail(), loginRequest.getSenha());
    }
    
}
