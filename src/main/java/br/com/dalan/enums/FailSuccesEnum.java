package br.com.dalan.enums;

import lombok.Getter;

@Getter
public enum FailSuccesEnum {
	
	FAIL("fail"),
	SUCCESS("success");
	
	private String descricao;
	
	private FailSuccesEnum(String descricao) {
		this.descricao = descricao;
	}
}