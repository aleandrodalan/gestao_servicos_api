package br.com.dalan.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.dalan.enums.TipoDeficienciaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Deficiencia {
	
	@Column(name = "POSSUI_DEFICIENCIA")
	private Boolean possuiDeficiencia;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_DEFICIENCIA")
	private TipoDeficienciaEnum tipoDeficienciaEnum;
}