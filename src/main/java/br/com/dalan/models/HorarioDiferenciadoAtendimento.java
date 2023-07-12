package br.com.dalan.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.dalan.enums.PeriodoAtendimento;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class HorarioDiferenciadoAtendimento {

	@Column(name = "GOST_HORAR_DIFERENC")	
	private Boolean gostariaTivesseHorarioDiferenciadoAtend;
	
	@Column(name = "PERIODO_ATEND")	
	@Enumerated(EnumType.STRING)
	private PeriodoAtendimento periodoAtendimento;
}