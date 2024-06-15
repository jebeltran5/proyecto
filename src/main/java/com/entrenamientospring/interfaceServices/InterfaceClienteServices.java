package com.entrenamientospring.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.entrenamientospring.models.Cliente;

public interface InterfaceClienteServices {
     
public	List<Cliente> listar();
public int guardar(Cliente C);
public void borrar (int id);
public  Optional<Cliente>consultaruncliente (int id);    
}
