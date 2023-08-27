package br.com.jsn.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jsn.springbootapp.entity.Cadastro;
import br.com.jsn.springbootapp.repository.CadastroRepository;

@Service
public class CadastroService  implements CrudService<Cadastro>{
	
	@Autowired
	private CadastroRepository cadastroRepository;

	@Override
	public String criar(Cadastro data) {
		String result = null ;
		ObjectMapper objectMapper = new ObjectMapper();
		Cadastro novoCadastro = null ;
		try {
		
			novoCadastro = cadastroRepository.saveAndFlush(data);
			 result = objectMapper.writeValueAsString(novoCadastro);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			e.getMessage();
		}
			return result ;
	}
	

	@Override
	public String listar() {
		
		String result = null ;
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			 result = objectMapper.writeValueAsString(cadastroRepository.findAll());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		return result ;
	}

	@Override
	public String encontrar(Integer id) {
		String result = null ;
		ObjectMapper objectMapper = new ObjectMapper();
		Cadastro novoCadastro = null ;
		try {
			
			novoCadastro = cadastroRepository.buscarCadastro(id);
			 result = objectMapper.writeValueAsString(novoCadastro);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			e.getMessage();
		}
			return result ;
	}

	@Override
	public void deletar(Integer id) {

		try {
	
			cadastroRepository.deleteById(id.longValue());
		} catch (Exception e) {
				
				e.printStackTrace();
				e.getMessage();
			}
		
	}

	@Override
	public String atualizar(Cadastro data) {
		String result = null ;
		ObjectMapper objectMapper = new ObjectMapper();
		Cadastro updateCadastro = null ;
		try {
			updateCadastro = cadastroRepository.findById(data.getId().longValue())
					.map(cadastro -> {
			                
			            	cadastro.setEmail(data.getEmail());
			            	cadastro.setNome(data.getNome());
			            	cadastro.setTelefone(data.getTelefone());
			            	cadastro.setTipo(data.getTipo());
			                return cadastroRepository.save(cadastro);
			            })
			            .orElseGet(() -> {
			                return cadastroRepository.saveAndFlush(data);
			            });
			
			 result = objectMapper.writeValueAsString(updateCadastro);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			e.getMessage();
		}
			return result ;
	}

	

}
