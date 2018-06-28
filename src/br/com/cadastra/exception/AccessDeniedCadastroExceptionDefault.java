package br.com.cadastra.exception;

public class AccessDeniedCadastroExceptionDefault extends CadastroExceptionDefault implements CadastroException {

	private static final long serialVersionUID = 1L;

	public AccessDeniedCadastroExceptionDefault(String message) {
        super(message);
    }

}
