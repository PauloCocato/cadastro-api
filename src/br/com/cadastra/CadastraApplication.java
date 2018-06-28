package br.com.cadastra;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Autowire;
import org.springframework.web.context.request.RequestAttributes;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
public class CadastraApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastraApplication.class, args);
    }

    // para retornar sempre no formato "mensagem": "descrição do erro"
    @Bean
    public ErrorAttributes errorAttributes() {
        return new DefaultErrorAttributes() {

            @Override
            public Map<String, Object> getErrorAttributes(
                    RequestAttributes requestAttributes,
                    boolean includeStackTrace) {
                Map<String, Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);

                Map<String, Object> result = new HashMap<>();
                Object errorMessage = errorAttributes.get("message");
//                Object errorMessage = requestAttributes.getAttribute(RequestDispatcher.ERROR_MESSAGE, RequestAttributes.SCOPE_REQUEST);
                if (errorMessage == null || !(errorMessage instanceof String && !((String) errorMessage).isEmpty())) {
                    return errorAttributes;
                } else {
                    result.put("messagem", errorMessage);
                    return result;
                }

            }

        };
    }

}
