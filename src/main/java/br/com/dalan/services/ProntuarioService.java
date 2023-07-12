package br.com.dalan.services;

import java.util.List;

import br.com.dalan.models.Prontuario;

public interface ProntuarioService {

	void salvar(Prontuario prontuario);
	
	void alterar(Prontuario prontuario);
	
	void excluir(Long id);
	
	List<Prontuario> buscarTodosProntuarios();
	
	Prontuario buscarProntuarioPorId(Long id);
	
	List<Prontuario> buscarProntuariosPorNomePaciente(String nome);
	
	Boolean verificarPorIdSeExistePaciente(Long id);
	
	Boolean verificarPorIdSeExisteUnidadeSaude(Long id);
}