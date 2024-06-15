package com.entrenamientospring.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entrenamientospring.models.Cliente;

@Repository
public interface ClienteInterface extends CrudRepository<Cliente, Integer>{
	
	

}
