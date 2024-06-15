package com.entrenamientospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entrenamientospring.interfaceServices.InterfaceClienteServices;
import com.entrenamientospring.interfaces.ClienteInterface;
import com.entrenamientospring.models.Cliente;

@Service
public class ClienteServices implements InterfaceClienteServices{
	
	@Autowired
	private ClienteInterface datos;

	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)datos.findAll();
	}

	@Override
	public int guardar(Cliente c) {
		// TODO Auto-generated method stub
		int resultado=0;
		Cliente cli = datos.save(c);
		if(!cli.equals(null)) {
			resultado=1;
		}
		return resultado;
	}

	@Override
	public void borrar(int id) {
		datos.deleteById(id);
		
	}

	@Override
	public Optional<Cliente> consultaruncliente(int id) {
		return datos.findById(id);
	}

}
