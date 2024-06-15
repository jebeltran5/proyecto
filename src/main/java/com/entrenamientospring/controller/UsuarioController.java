package com.entrenamientospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entrenamientospring.interfaceServices.InterfaceUsuarioServices;
import com.entrenamientospring.models.Usuario;

@Controller
@RequestMapping
public class UsuarioController {
	@Autowired
	private InterfaceUsuarioServices service;
	
	@GetMapping("Usuario/listar")
	public String listar(Model model) {
		List<Usuario>usuario=service.listar();
		model.addAttribute("usuario", usuario);
		return "Usuario/listar";
	}
	@GetMapping("Usuario/insertar")
	  public String VistaGuardar(Model model) {
		model.addAttribute("usuario",new Usuario(0, null, null, null, null));
		  return "Usuario/insertar";
	  }
	  @PostMapping("Usuario/guardar")
	  public String guardar (@Validated Usuario u,Model model) {
		  service.guardar(u);
		  return "redirect:/Usuario/listar";
	  }

}
