package br.com.dalan.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.dalan.enums.FrequenciaAtividadeFisica;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class AtividadeFisica {

	@Column(name = "PRATICA_ATIV_FISICA")	
	private Boolean praticaAtividadeFisica;
	
	@Column(name = "FREQUENC_ATIV_FISICA")	
	@Enumerated(EnumType.STRING)
	private FrequenciaAtividadeFisica frequenciaAtividadeFisica;
}
