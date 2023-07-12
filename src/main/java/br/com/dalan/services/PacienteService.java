package br.com.dalan.services;

import java.time.LocalDate;
import java.util.List;

import br.com.dalan.models.Paciente;

public interface PacienteService {
	
	void salvar(Paciente paciente);
	
	void editar(Paciente paciente);

	void excluir(Long id);
	
	List<Paciente> buscarTodos();
	
	Paciente buscarPorId(Long id);
	
	List<Paciente> buscarPorNome(String nome);
	
//	Boolean verificarPorIdSeExisteUnidadeSaude(Long id);	
	
	int calcularIdade(LocalDate data);
}