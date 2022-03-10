package com.bancol.springboot.app.models.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto {
	
	@Id
	private String idProducto;
	
	private String nombre;
	
	private String tipoProduct;		
	
	private String descripcion;
	
	private Double precio;	
	
	
	
	public Producto() {}


	public Producto(String nombre, String tipoProduct, String descripcion, Double precio) {
		this.nombre = nombre;
		this.tipoProduct = tipoProduct;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	
	
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getTipoProduct() {
		return tipoProduct;
	}

	public void setTipoProduct(String tipoProduct) {
		this.tipoProduct = tipoProduct;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	

}
