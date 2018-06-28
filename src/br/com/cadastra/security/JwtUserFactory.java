package br.com.cadastra.security;

import br.com.cadastra.model.Usuario;
import java.util.ArrayList;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuario usuario) {

        return new JwtUser(
                usuario.getId(),
                usuario.getEmail(),
                usuario.getNome(),
                usuario.getToken(),
                usuario.getSenha(),
                new ArrayList<>(),
                true,
                usuario.getUltimoLogin()
        );
    }

}
