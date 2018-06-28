package br.com.cadastra.exception;

public class CadastroExceptionDefault extends RuntimeException implements CadastroException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CadastroExceptionDefault(String message) {
        super(message);
    }

    @Override
    public CadastroError generateCadastroError() {
        return new CadastroErrorDefault(getMessage());
    }

}
