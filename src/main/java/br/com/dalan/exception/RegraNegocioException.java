package br.com.dalan.exception;

@SuppressWarnings("serial")
public class RegraNegocioException extends RuntimeException {

	public RegraNegocioException(String msg) {
		super(msg);
	}
}