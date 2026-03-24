package br.com.somar.backend_somar.Mapping;

import org.springframework.stereotype.Component;

import br.com.somar.backend_somar.DTO.Requests.UsuarioCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Responses.UsuarioCreateResponseDTO;
import br.com.somar.backend_somar.Models.Usuario;

@Component
public class UsuarioMapper {
    
    //Converte o DTO em um Entity, pegando o gets passados pelo DTO de USUARIO
    public Usuario toEntity(UsuarioCreateRequestDTO dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setTipo(dto.getTipo());
        return usuario;
    }

    //Converte a entity em um DTO de response
    public UsuarioCreateResponseDTO toResponseDTO(Usuario usuario){
        return new UsuarioCreateResponseDTO(
            usuario.getId(),
            usuario.getNome(), 
            usuario.getEmail(), 
            usuario.getSenha(), 
            usuario.getTipo()
        );
    }

}
