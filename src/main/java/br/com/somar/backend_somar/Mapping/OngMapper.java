package br.com.somar.backend_somar.Mapping;

import org.springframework.stereotype.Component;

import br.com.somar.backend_somar.DTO.Requests.OngCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Responses.OngCreateResponseDTO;
import br.com.somar.backend_somar.Models.Ong;
import br.com.somar.backend_somar.Repository.UsuarioRepository;

@Component
public class OngMapper {
    private final UsuarioRepository usuarioRepository;

    public OngMapper(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Ong toEntity(OngCreateRequestDTO dto){
        Ong ong = new Ong();
        ong.setNome(dto.getNome());
        ong.setDescricao(dto.getDescricao());
        ong.setDocumento(dto.getDocumento());
        ong.setTelefone(dto.getTelefone());
        ong.setCidade(dto.getCidade());
        ong.setEstado(dto.getEstado());
        var usuario = usuarioRepository.findById(dto.getCodusuario()).orElseThrow(() -> new RuntimeException("Ong não encontrada"));
        ong.setUsuario(usuario);
        return ong;
    }

    public OngCreateResponseDTO toOngResponseDTO(Ong ong){
        return new OngCreateResponseDTO(
            ong.getId(),
            ong.getNome(),
            ong.getDescricao(),
            ong.getDocumento(),
            ong.getTelefone(),
            ong.getCidade(),
            ong.getEstado(),
            ong.getUsuario(),
            ong.getDatacriacao()
        );
    }
}
