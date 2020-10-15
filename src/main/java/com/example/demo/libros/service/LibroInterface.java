package com.example.demo.libros.service;

import java.util.List;

import com.example.demo.libros.dto.Libro;

public interface LibroInterface {
	public void guardarLibro(Libro libro);
	public Libro consultarLibro(Integer codigo);
	public void actualizarLibro(Libro libro);
	public void borrarLibro(Integer codigo);
	public List<Libro> consultarLibros();
}
