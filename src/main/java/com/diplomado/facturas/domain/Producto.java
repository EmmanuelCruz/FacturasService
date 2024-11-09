package com.diplomado.facturas.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Producto {
	@NotBlank(message="La clave no puede ser nula")
	private String clave;
	@NotBlank(message="La descripción no puede ser nula")
	private String descripcion;
}
