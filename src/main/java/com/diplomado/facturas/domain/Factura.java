package com.diplomado.facturas.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="facturas")

public class Factura {
	@Id
	private String id;
	private String precioVenta;
	private String fecha;
	private String divisa;
	private Producto producto;
}
