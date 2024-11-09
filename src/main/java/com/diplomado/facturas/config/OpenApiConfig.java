package com.diplomado.facturas.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "Factura Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "Factura Service para el control de facturación.", 
			contact = @Contact(
				name = "Emmanuel Cruz Hernández", 
				url = "https://github.com/EmmanuelCruz", 
			email = "emmanuel.cruzhe@gmail.com")))
public class OpenApiConfig {

}