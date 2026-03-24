package br.com.somar.backend_somar.Models;

import java.time.LocalDateTime;

import br.com.somar.backend_somar.Enums.CampanhaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "campanha")
public class Campanha {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany
    @JoinColumn(name = "codong", nullable = false)
    private Ong ong;

    String titulo;
    String descricao;
    float meta;
    float valoratual;
    
    @Enumerated(EnumType.STRING)
    private CampanhaEnum status;

    LocalDateTime diafinalizado;
}
