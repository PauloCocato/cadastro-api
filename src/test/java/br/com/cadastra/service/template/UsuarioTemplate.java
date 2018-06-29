package br.com.cadastra.service.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import br.com.cadastra.model.Telefone;
import br.com.cadastra.model.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioTemplate implements TemplateLoader {

    public static String VALID_USUARIO_NOVO = "validUsuarioNovo";

    @Override
    public void load() {
        Fixture.of(Usuario.class).addTemplate(VALID_USUARIO_NOVO, new Rule() {{
            add("nome", "paulo cocato");
            add("email", "paulo.cocato@gmail.com");
            add("senha", "123abc");
            add("dataCriacao", LocalDate.now());
            add("dataAtualizacao", LocalDate.now());
            add("ultimoLogin", LocalDateTime.now());
            add("token", "tok3n");
            add("telefones", has(2).of(Telefone.class, TelefoneTemplate.VALID_TELEFONE11, TelefoneTemplate.VALID_TELEFONE47));
        }});
    }

}
