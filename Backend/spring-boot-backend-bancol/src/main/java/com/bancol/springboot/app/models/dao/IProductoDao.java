package com.bancol.springboot.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bancol.springboot.app.models.entity.Producto;

public interface IProductoDao extends ReactiveMongoRepository<Producto, String>{

}
