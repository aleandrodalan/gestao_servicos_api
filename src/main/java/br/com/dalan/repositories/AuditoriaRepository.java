package br.com.dalan.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dalan.models.Auditoria;

public interface AuditoriaRepository extends JpaRepository<Auditoria, Long> {
	
	List<Auditoria> findByDataAcessoBetween(LocalDateTime dataInicial, LocalDateTime dataFinal);
}