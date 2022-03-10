package com.bancol.springboot.app.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancol.springboot.app.models.dao.IProductoDao;
import com.bancol.springboot.app.models.entity.Producto;
import com.bancol.springboot.app.models.services.ProductoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	private ProductoService service;
	
//	@GetMapping
//	public Flux<Producto> listar() {
//		return service.findAll();
//	}
	
	@GetMapping
	public Mono<ResponseEntity<Flux<Producto>>> listarr() {
		return Mono.just(
				ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(service.findAll())
				);
	}
	
	@GetMapping("/{id}")
	public Mono<ResponseEntity<Producto>> ver(@PathVariable String id){
		return service.findById(id).map( p -> ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(p))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Mono<ResponseEntity<Producto>> crear(@RequestBody Producto producto){
		return service.save(producto).map(p -> ResponseEntity.created(URI.create("/api/productos/".concat(p.getIdProducto())))
				.contentType(MediaType.APPLICATION_JSON)
				.body(p));
	}
}
