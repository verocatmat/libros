package com.example.demo.libros.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.libros.dto.Libro;

public class LibroService implements LibroInterface{
	//se crea el mapa para almacenar datos del libro
	Map <Integer,Libro> libros=new HashMap<>();
	@Override
	public void guardarLibro(Libro libro) {
		// se agrega al mapa la clave y el obj libro
		libros.put(libro.getCodigo(), libro);
	}

	@Override
	public Libro consultarLibro(Integer codigo) {
		// obtenemos el obj libro por codigo
		Libro libro=libros.get(codigo);
		return libro;
	}

	@Override
	public void actualizarLibro(Libro libro) {
		// se agrega al mapa la clave y el obj libro que se actualizara
		libros.put(libro.getCodigo(),libro);
	}

	@Override
	public void borrarLibro(Integer codigo) {
		// se borra la clave y el valor de la clave que se pasa como parametro, del mapa
		libros.remove(codigo);
	}
	
	public List<Libro> consultarLibros(){
		//guardamos en una lista la colleccion de datos que se tienen almacenados en el mapa
		List <Libro> listaLibros=new ArrayList<Libro>(libros.values());
		return listaLibros;

	}
}
