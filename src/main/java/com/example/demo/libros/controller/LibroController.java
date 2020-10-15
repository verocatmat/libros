package com.example.demo.libros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.libros.dto.Libro;
import com.example.demo.libros.service.LibroService;

@RequestMapping("/libros")
@RestController
public class LibroController {
	
	@Autowired
	LibroService libroService;
	
	@PostMapping
	public void guardarLibro(@RequestBody Libro libro) {
		System.out.println("guardando libro");
		libroService.guardarLibro(libro);
		
	}
	
	@GetMapping("/{id}")
	public Libro consultarLibro(@PathVariable("id") Integer codigo) {
		Libro lib=libroService.consultarLibro(codigo);
		return lib;
	}
	
	@PutMapping
	public void actualizarLibro(@RequestBody Libro libro) {
		libroService.actualizarLibro(libro);
	}
	
	@DeleteMapping("/{id}")
	public void borrarLibro(@PathVariable("id") Integer codigo) {
		libroService.borrarLibro(codigo);
	}
	@GetMapping
	public List<Libro> listaLibros(){
		List <Libro>libros=libroService.consultarLibros();
		return libros;
	}
	
	
	
}
