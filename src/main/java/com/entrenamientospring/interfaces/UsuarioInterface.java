package com.entrenamientospring.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.entrenamientospring.models.Usuario;

public interface UsuarioInterface extends CrudRepository<Usuario, Integer>{

}
