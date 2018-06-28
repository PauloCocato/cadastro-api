package br.com.cadastra.service.validation;

import br.com.cadastra.model.Usuario;

public interface UsuarioValidator {

    void beforeCreate(Usuario usuario);

}
