package io.github.pablitohaddad.HelloWorld.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API de calculadora")
                        .description("Uma api de operações complexas de matemática")
                        .version("1.0.0")
                        .contact( new Contact()
                                .name("GEDS - Grupo de Estudo em Desenvolvimento de Software")
                                .url("https://github.com/pablitohaddad/geds")
                                .email("pablohaddad73@gmail.com")));
    }

}
