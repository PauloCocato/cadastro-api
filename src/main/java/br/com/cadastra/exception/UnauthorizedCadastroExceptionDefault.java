package br.com.cadastra.exception;

public class UnauthorizedCadastroExceptionDefault extends CadastroExceptionDefault implements CadastroException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedCadastroExceptionDefault(String message) {
        super(message);
    }

}
