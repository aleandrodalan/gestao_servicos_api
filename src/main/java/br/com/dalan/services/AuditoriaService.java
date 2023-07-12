package br.com.dalan.services;

import br.com.dalan.enums.OperacaoEnum;

public interface AuditoriaService {

	void salvarLog(Object o, OperacaoEnum operacao);
}