package br.com.jsn.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jsn.springbootapp.entity.Endereco;
import br.com.jsn.springbootapp.repository.EnderecoRepository;

@Service
public class EnderecoService implements CrudService<Endereco>{

	@Autowired
	private EnderecoRepository enderecoRepository ;
	
	
	@Override
	public String criar(Endereco data) {
		String result = null ;
		ObjectMapper objectMapper = new ObjectMapper();
		Endereco novoUsuario = null ;
		try {
		
			novoUsuario = enderecoRepository.saveAndFlush(data);
			 result = objectMapper.writeValueAsString(novoUsuario);
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
			 result = objectMapper.writeValueAsString(enderecoRepository.findAll());
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
		Endereco novoUsuario = null ;
		try {
			
			novoUsuario = enderecoRepository.buscarEndereco(id);
			 result = objectMapper.writeValueAsString(novoUsuario);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			e.getMessage();
		}
			return result ;
	}

	@Override
	public void deletar(Integer id) {
		
		try {
			
			enderecoRepository.deleteById(id.longValue());
		} catch (Exception e) {
				
				e.printStackTrace();
				e.getMessage();
			}
		
	}

	@Override
	public String atualizar(Endereco data) {
		String result = null ;
		ObjectMapper objectMapper = new ObjectMapper();
		Endereco updateEndereco = null ;
		try {
			updateEndereco = enderecoRepository.findById(data.getId().longValue())
			            .map(endereco -> {
			                
			            	endereco.setBairro(data.getBairro());
			            	endereco.setCep(data.getCep());
			            	endereco.setCidade(data.getCidade());
			            	endereco.setLogradouro(data.getLogradouro());
			            	endereco.setNumero(data.getNumero());
			            	endereco.setUf(data.getUf());
			                return enderecoRepository.save(endereco);
			            })
			            .orElseGet(() -> {
			                return enderecoRepository.saveAndFlush(data);
			            });
			
			 result = objectMapper.writeValueAsString(updateEndereco);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			e.getMessage();
		}
			return result ;
	}

	

}
