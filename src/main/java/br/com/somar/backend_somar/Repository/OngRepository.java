package br.com.somar.backend_somar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.somar.backend_somar.Models.Ong;

public interface OngRepository extends JpaRepository<Ong, Long>{
    
}
