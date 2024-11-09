package com.diplomado.facturas.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diplomado.facturas.domain.Factura;
import com.diplomado.facturas.repository.FacturaRepository;
import com.diplomado.facturas.service.FacturaService;

@RestController
@RequestMapping(path="api/facturas", produces="application/json")
@CrossOrigin(origins="*")

public class FacturaController {
	@Autowired
	private FacturaRepository facturaRepository;
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping
	public List<Factura> obtenerFacturas() {
		return facturaRepository.findAll();
	}
	
	@PostMapping(consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura crearFactura(@RequestBody Factura factura) {
		return facturaRepository.save(factura);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Factura> obtenerFacturaPorId(@PathVariable("id") String id) {
		Optional<Factura> factura = facturaRepository.findById(id);
		if (factura.isPresent()) {
			return new ResponseEntity<>(factura.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping(path="{id}", consumes="application/json")
	public ResponseEntity<Factura> actualizarFactura(
			@PathVariable("id") String id, @RequestBody Factura factura) {
		Factura facturaActualizado = facturaService.actualizarFactura(id, factura);
		if (facturaActualizado != null) {
			return new ResponseEntity<>(facturaActualizado, HttpStatus.OK) ;
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarFactura(@PathVariable("id") String id) {
		facturaRepository.deleteById(id);
	}
}
