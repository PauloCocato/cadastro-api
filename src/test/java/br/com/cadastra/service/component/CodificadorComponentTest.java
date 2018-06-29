package br.com.cadastra.service.component;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CodificadorComponentTest {

    @Mock
    private PasswordEncoder passwordEncoder;

    private CodificadorComponent codificadorComponent;

    @Before
    public void init() {
        codificadorComponent = new CodificadorComponentProvider(passwordEncoder);
    }

    @Test
    public void deveCodificarASenha() {
        // given
        String senha = "senha";

        // when
        when(passwordEncoder.encode(any())).thenReturn(senha);
        String senhaCodificada = codificadorComponent.codificar(senha);

        // then
        assertNotNull(senhaCodificada);
    }

}
