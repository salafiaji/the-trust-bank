package com.salafiaji.thetrustbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "The Trust Bank App", description = "Backend Rest APIs for TTA", version = "v1.0", contact = @Contact(name = "Aji Yemo", email = "salafiaji@gmail.com", url = "https://github.com/salafiaji/the-trust-bank"), license = @License(name = "the trust bank", url = "https://github.com/salafiaji/the-trust-bank")), externalDocs = @ExternalDocumentation(description = "the Trust bnak App Documentation", url = "https://github.com/salafiaji/the-trust-bank"))

public class TheTrustBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheTrustBankApplication.class, args);
	}

}
