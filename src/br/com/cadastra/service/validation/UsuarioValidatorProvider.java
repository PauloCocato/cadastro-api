package br.com.cadastra.service.validation;

import br.com.cadastra.exception.BusinessCadastroExceptionDefault;
import br.com.cadastra.model.Usuario;
import br.com.cadastra.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UsuarioValidatorProvider implements UsuarioValidator {

    @Autowired
    private UsuarioService usuarioService;

    public UsuarioValidatorProvider() {

    }

    public UsuarioValidatorProvider(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void beforeCreate(Usuario usuario) {
        Integer count = usuarioService.countByEmail(usuario.getEmail());
        if (count > 0) {
            throw new BusinessCadastroExceptionDefault("E-mail já existente");
        }
    }

}
