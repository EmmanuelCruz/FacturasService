package com.diplomado.facturas.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.diplomado.facturas.domain.Factura;

@Data
@NoArgsConstructor
public class RegistroFacturaRequest {
	
	@NotNull
	@Valid
	private Factura factura;
}
