package br.com.dalan.services;

import java.util.List;

import br.com.dalan.models.UnidadeSaude;

public interface UnidadeSaudeService {

	void salvar(UnidadeSaude unidadeSaude);
	
	void editar(UnidadeSaude unidadeSaude);
	
	List<UnidadeSaude> buscarTodos();
	
	UnidadeSaude buscarPorId(Long id);
	
	void excluir(Long id);
	
	List<UnidadeSaude> buscarPorNome(String nome);
}