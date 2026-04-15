package br.com.somar.backend_somar.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.somar.backend_somar.DTO.Requests.OngCreateRequestDTO;
import br.com.somar.backend_somar.Models.Ong;
import br.com.somar.backend_somar.Models.Usuario;
import br.com.somar.backend_somar.Repository.OngRepository;
import br.com.somar.backend_somar.Repository.UsuarioRepository;

@Service
public class OngService {
    private final OngRepository ongRepository;
    private final UsuarioRepository usuarioRepository;

    public OngService(OngRepository ongRepository, UsuarioRepository usuarioRepository){
        this.ongRepository = ongRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Ong salvarOng(OngCreateRequestDTO ongCreateRequestDTO){
        Ong ong = new Ong();
        ong.setNome(ongCreateRequestDTO.getNome());
        ong.setDescricao(ongCreateRequestDTO.getDescricao());
        ong.setDocumento(ongCreateRequestDTO.getDocumento());
        ong.setTelefone(ongCreateRequestDTO.getTelefone());
        ong.setCidade(ongCreateRequestDTO.getCidade());
        ong.setEstado(ongCreateRequestDTO.getEstado());
        Usuario usuario = usuarioRepository.findById(ongCreateRequestDTO.getCodusuario()).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        ong.setUsuario(usuario);
        return ongRepository.save(ong);
    }

    public List<Ong> listarOngs(){
        return ongRepository.findAll();
    }
}
