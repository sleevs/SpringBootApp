package br.com.jsn.springbootapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface Crud <E>{
	
	@PostMapping("/criar") 
	public ResponseEntity<String> criar(@RequestBody E model);
	
	@GetMapping("/listar")
	public ResponseEntity<String> listar();
	
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<String> buscar(@PathVariable Integer id);
	


	@PutMapping("/atualizar")
	public ResponseEntity<String> atualizar(@RequestBody E model );
	
	

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<String> deletar(@PathVariable Integer id);


}
