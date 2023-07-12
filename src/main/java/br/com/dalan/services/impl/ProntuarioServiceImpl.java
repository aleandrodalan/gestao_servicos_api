package br.com.dalan.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dalan.enums.OperacaoEnum;
import br.com.dalan.exception.RegraNegocioException;
import br.com.dalan.models.Prontuario;
import br.com.dalan.repositories.ProntuarioRepository;
import br.com.dalan.services.AuditoriaService;
import br.com.dalan.services.ProntuarioService;

@Service
public class ProntuarioServiceImpl implements ProntuarioService {

	@Autowired
	private ProntuarioRepository prontuarioRepository;
	
	@Autowired
	private AuditoriaService auditoriaService;
	
	@Override
	public void salvar(Prontuario prontuario) {
		try {
			prontuarioRepository.save(prontuario);
			auditoriaService.salvarLog(prontuario, OperacaoEnum.INCLUSAO);
		} catch(Exception e) {
			throw new RegraNegocioException("Não foi possível salvar o Prontuário");
		}
	}

	@Override
	public void alterar(Prontuario prontuario) {
		try {
			prontuarioRepository.save(prontuario);
			auditoriaService.salvarLog(prontuario, OperacaoEnum.ALTERACAO);
		} catch(Exception e) {
			throw new RegraNegocioException("Não foi possível editar o Prontuário");
		}
	}

	@Override
	public void excluir(Long id) {
		try {
			auditoriaService.salvarLog(prontuarioRepository.findById(id), OperacaoEnum.EXCLUSAO);
			prontuarioRepository.deleteById(id);
		} catch(Exception e) {
			throw new RegraNegocioException("Não foi possível excluir o Prontuário");
		}
	}

	@Override
	public List<Prontuario> buscarTodosProntuarios() {
		return prontuarioRepository.findAll();
	}

	@Override
	public Prontuario buscarProntuarioPorId(Long id) {
		return prontuarioRepository.findById(id).get();
	}

	@Override
	public List<Prontuario> buscarProntuariosPorNomePaciente(String nome) {
		return prontuarioRepository.findByPacientePessoaNomeContainingIgnoreCase(nome);
	}

	@Override
	public Boolean verificarPorIdSeExistePaciente(Long id) {
		return prontuarioRepository.existsByPacienteId(id);
	}

	@Override
	public Boolean verificarPorIdSeExisteUnidadeSaude(Long id) {
		return prontuarioRepository.existsByUnidadeSaudeId(id);
	}
}