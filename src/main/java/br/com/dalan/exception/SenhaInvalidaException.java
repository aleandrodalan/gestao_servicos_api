package br.com.dalan.exception;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends RuntimeException {
	
	public SenhaInvalidaException() {
		super("Senha inválida");
	}
}