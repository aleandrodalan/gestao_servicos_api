package br.com.dalan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dalan.models.Prontuario;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
	
	List<Prontuario> findByPacientePessoaNomeContainingIgnoreCase(String nome);
	
	Boolean existsByPacienteId(Long id);
	
	Boolean existsByUnidadeSaudeId(Long id);
}