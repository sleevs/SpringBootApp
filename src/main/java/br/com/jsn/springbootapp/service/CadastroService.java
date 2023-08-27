package br.com.jsn.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.springbootapp.entity.Cadastro;
import br.com.jsn.springbootapp.repository.CadastroRepository;

@Service
public class CadastroService  implements CrudService<Cadastro>{
	
	@Autowired
	private CadastroRepository cadastroRepository;

	@Override
	public String criar(Cadastro data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String encontrar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String atualizar(Cadastro data) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
