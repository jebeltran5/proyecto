package com.entrenamientospring.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.entrenamientospring.models.Usuario;

public interface InterfaceUsuarioServices {
	
	public List<Usuario>listar ();
	public int guardar (Usuario u);
	public void borrar(int id);
	public Optional<Usuario>consultarunusuario(int id);

}
