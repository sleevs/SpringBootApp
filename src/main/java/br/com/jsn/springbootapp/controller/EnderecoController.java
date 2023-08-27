package br.com.jsn.springbootapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jsn.springbootapp.entity.Endereco;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController implements Crud<Endereco>{

	@Override
	public ResponseEntity<String> criar(Endereco model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> atualizar(Endereco model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deletar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
