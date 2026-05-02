package br.com.somar.backend_somar.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.somar.backend_somar.DTO.Requests.UsuarioCreateRequestDTO;
import br.com.somar.backend_somar.DTO.Requests.UsuarioUpdateRequestDTO;
import br.com.somar.backend_somar.Models.Usuario;
import br.com.somar.backend_somar.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository; 
    }  

    // Salvar Usuário
    public Usuario salvarUsuario(UsuarioCreateRequestDTO usuarioCreateRequestDTO){
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioCreateRequestDTO.getNome());
        usuario.setEmail(usuarioCreateRequestDTO.getEmail());
        usuario.setSenha(usuarioCreateRequestDTO.getSenha());
        usuario.setTipo(usuarioCreateRequestDTO.getTipo());
        return usuarioRepository.save(usuario);
    }

    // Listar Usuarios
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario atualizarUsuario(Long id, UsuarioUpdateRequestDTO usuarioUpdateRequestDTO){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
        usuario.setNome(usuarioUpdateRequestDTO.getNome());
        usuario.setEmail(usuarioUpdateRequestDTO.getEmail());
        usuario.setSenha(usuarioUpdateRequestDTO.getSenha());
        usuario.setTipo(usuarioUpdateRequestDTO.getTipo());
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuarioRepository.delete(usuario);
    }

     public String logarUsuario(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmail(email)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        
        if (!usuario.getSenha().equals(senha)) {
            throw new RuntimeException("Senha incorreta");
        }
        return "Usuário Logado";
    }
}
