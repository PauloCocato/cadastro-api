package br.com.cadastra.exception;

public class CadastroErrorDefault implements CadastroError {

    private final String mensagem;

    public CadastroErrorDefault(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMensagem() {
        return mensagem;
    }

}
