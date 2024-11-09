package com.diplomado.facturas.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diplomado.facturas.domain.Factura;

public interface FacturaRepository extends MongoRepository<Factura, String>{
	
	Optional<Factura> findById(String id);

}
