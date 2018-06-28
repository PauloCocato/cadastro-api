package br.com.cadastra.exception;

public class BusinessCadastroExceptionDefault extends CadastroExceptionDefault implements CadastroException {

	private static final long serialVersionUID = 1L;

	public BusinessCadastroExceptionDefault(String message) {
        super(message);
    }

}
