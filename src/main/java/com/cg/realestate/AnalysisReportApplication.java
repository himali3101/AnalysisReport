package com.cg.realestate;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AnalysisReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisReportApplication.class, args);
	}

	@Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                   .select()
                   .paths(PathSelectors.any())
                   .apis(RequestHandlerSelectors.basePackage("com.cg.realestate"))
                   .build()
                   .apiInfo(myApiInfo());
           }
	
	private ApiInfo myApiInfo() {
        // for version 2.9.1
        ApiInfo apiInfo=new ApiInfo(
                "SPRING WITH SWAGGER API",
                 "API CREATION",
                 "1.0",
                 "Free to Use",
                 new Contact("Himali Gunjal","/property" ,"himaligunjal31@gmail.com"),
                 "API licence",
                 "/limits",
                 Collections.emptyList());
        return apiInfo;  }
}



