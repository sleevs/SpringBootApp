package br.com.jsn.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jsn.springbootapp.entity.Cadastro;
import br.com.jsn.springbootapp.service.CadastroService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController implements Crud<Cadastro> {

	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping(value="/teste")
	public String test() {
		return "MUNIZ SOARES ENGENHARIA DE SOFTWATE";
	}

	@Override
	public ResponseEntity<String> criar(Cadastro model) {
		try {
			String result = cadastroService.criar(model);
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> listar() {
		try {
			String result = cadastroService.listar();
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> buscar(Integer id) {
		try {
			String result = cadastroService.encontrar(id);
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> atualizar(Cadastro model) {
		try {
			String result = cadastroService.atualizar(model);
			return ResponseEntity.ok(result);
			
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<String> deletar(Integer id) {
		try {
			cadastroService.deletar(id);
				return ResponseEntity.ok("OPERAÇÃO CONCLUÍDA");
				
			}catch(Exception e){
				return new ResponseEntity<>(e.getMessage() , HttpStatus.BAD_REQUEST);
			}
	}

}
