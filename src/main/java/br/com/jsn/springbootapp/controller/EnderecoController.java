package br.com.jsn.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jsn.springbootapp.entity.Endereco;
import br.com.jsn.springbootapp.service.EnderecoService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController implements Crud<Endereco>{

	@Autowired
	private EnderecoService enderecoService;
	
	
	@Override
	public ResponseEntity<String> criar(Endereco model) {
		try {
			String result = enderecoService.criar(model);
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> listar() {
		try {
			String result = enderecoService.listar();
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public ResponseEntity<String> buscar(Integer id) {
		try {
			String result = enderecoService.encontrar(id);
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> atualizar(Endereco model) {
		try {
			String result = enderecoService.atualizar(model);
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> deletar(Integer id) {
		try {
			enderecoService.deletar(id);
				return ResponseEntity.ok("OPERAÇÃO CONCLUÍDA");
				
			}catch(Exception e){
				return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
			}
	}

	

	
}
