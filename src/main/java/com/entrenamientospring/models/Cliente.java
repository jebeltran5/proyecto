package com.entrenamientospring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table (name = "clientes")
public class Cliente {
	  @Id
	  @GeneratedValue(strategy= GenerationType.IDENTITY)
      private int Id;
      private String Nombre;
      private String Apellido;
      private String Direccion;
      private String Celular;
      
      
     
      
      public Cliente() {
		
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nombre, String apellido, String direccion, String celular) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Celular= celular;
	}
	//setters y getters
      
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}

	@Override
	public String toString() {
		return "Cliente [Id=" + Id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + "]";
	}
}
