package com.entrenamientospring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entrenamientospring.interfaceServices.InterfaceClienteServices;
import com.entrenamientospring.models.Cliente;

@Controller
@RequestMapping
public class ClienteController {
     
	
	   @Autowired
	  private InterfaceClienteServices service;
	   
	  @GetMapping("Cliente/listar")
	  public String listar(Model model) {
		  
		  List<Cliente>cliente=service.listar();
		  model.addAttribute("cliente" , cliente);
		  return "Cliente/listar";  
		    
	  }
	  
	  @GetMapping("Cliente/insertar")
	  public String VistaGuardar(Model model) {
		model.addAttribute("cliente",new Cliente());
		  return "Cliente/insertar";
	  }
	  @PostMapping("Cliente/guardar")
	  public String guardar (@Validated Cliente c,Model model) {
		  service.guardar(c);
		  return "redirect:/Cliente/listar";
	  }
	  @GetMapping("Cliente/Actualizar/{id}")
	  public String actualizar(@PathVariable int id,Model model) {
		  Optional<Cliente>cliente=service.consultaruncliente(id);
		  model.addAttribute("cliente",cliente);
		  return "Cliente/Actualizar";
	  }
	  @GetMapping("Cliente/Borrar/{id}")
	  public String borrar(@PathVariable int id,Model model) {
		  service.borrar(id);
		  return "redirect:/Cliente/listar";
	  }
}
