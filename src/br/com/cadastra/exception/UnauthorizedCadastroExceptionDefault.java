package br.com.cadastra.exception;

public class UnauthorizedCadastroExceptionDefault extends CadastroExceptionDefault implements CadastroException {

    public UnauthorizedCadastroExceptionDefault(String message) {
        super(message);
    }

}
