package info.thecodinglive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.*;

@Configuration
public class SwaggerConfig {

    // @Bean
    // public UiConfiguration uiConfig() {
    // return UiConfiguration.Default;
    // }

    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("Jpub Spring Boot").description("Spring Boot Rest Api").version("1.0")
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(regex("/basic/.*")).build().apiInfo(metadata());
    }

}
