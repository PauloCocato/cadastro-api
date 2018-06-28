package br.com.cadastra.security.service;

import br.com.cadastra.model.Usuario;
import br.com.cadastra.security.UsuarioAuthentication;
import org.springframework.security.core.AuthenticationException;

public interface AuthenticationRestService {

    void createAuthentication(UsuarioAuthentication usuario) throws AuthenticationException;

    Usuario createAuthenticationToken(UsuarioAuthentication usuarioAuthentication) throws AuthenticationException;

}
