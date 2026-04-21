package br.com.somar.backend_somar.Models;

import br.com.somar.backend_somar.Enums.UsuarioEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    String nome;
    String email;
    String senha;

    @Enumerated(EnumType.STRING)
    private UsuarioEnum tipo;

    @OneToOne
    @JoinColumn(name="codusuario")
    private Usuario usuario;
}
