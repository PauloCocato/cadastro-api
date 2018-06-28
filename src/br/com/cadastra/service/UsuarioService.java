package br.com.cadastra.service;

import br.com.cadastra.model.Usuario;
import br.com.cadastra.security.UsuarioAuthentication;
import java.util.Optional;

public interface UsuarioService {

    Usuario create(Usuario usuario);

    Usuario updateToken(UsuarioAuthentication usuarioAuthentication);

    Usuario getByEmailESenha(String email, String senha);

    Integer countByEmail(String email);

    Optional<Usuario> getByEmail(String email);

    Optional<Usuario> getUsuarioLogado();

    void validarTokenGravado(String email, String authToken);
}
