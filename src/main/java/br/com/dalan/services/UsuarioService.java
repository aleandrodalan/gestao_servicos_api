package br.com.dalan.services;

import java.util.List;

import br.com.dalan.dto.UsuarioDTO;
import br.com.dalan.enums.StatusEnum;
import br.com.dalan.models.Usuario;

public interface UsuarioService {
	
	Usuario salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	List<Usuario> buscarTodosUsuarios();	
	
	Usuario buscarUsuarioPorId(Long id);
	
	List<Usuario> buscarUsuarioPorLogin(String login);
	
	Usuario buscarExatoUsuarioPorLogin(String login);
	
	List<Usuario> buscarUsuariosPorStatus(StatusEnum status);
	
	List<Usuario> buscar(Usuario usuario);
	
	UsuarioDTO converterParaObjetoDTO(Usuario usuario);
}	