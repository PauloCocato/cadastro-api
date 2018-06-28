package br.com.cadastra.security.service;

import br.com.cadastra.exception.UnauthorizedCadastroExceptionDefault;
import br.com.cadastra.model.Usuario;
import br.com.cadastra.security.JwtUserFactory;
import br.com.cadastra.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class JwtUsuarioServiceServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) {
        Usuario usuario = usuarioService
                .getByEmail(email)
                .orElseThrow(() -> {
                    return new UnauthorizedCadastroExceptionDefault("Usuário e/ou senha inválidos");
                });

        return JwtUserFactory.create(usuario);
    }

}
