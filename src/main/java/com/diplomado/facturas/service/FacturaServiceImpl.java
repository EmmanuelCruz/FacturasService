package com.diplomado.facturas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diplomado.facturas.domain.Factura;
import com.diplomado.facturas.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	private FacturaRepository facturaRepository;

	@Override
	public Factura actualizarFactura(String id, Factura factura) {
		Optional<Factura> facturaExistente = facturaRepository.findById(id);
		if (facturaExistente.isPresent()) {
			Factura facturaActualizar = facturaExistente.get();
			facturaActualizar.setPrecioVenta(factura.getPrecioVenta());
			facturaRepository.save(facturaActualizar);
			return facturaActualizar;
		}
		return null;
	}

}
