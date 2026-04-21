package br.com.somar.backend_somar.Models;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ong")
public class Ong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String nome;
    String descricao;
    String documento;
    String telefone;
    String cidade;
    String estado;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codusuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Campanha> campanhas;
    
    @CreationTimestamp
    LocalDateTime datacriacao;
}
