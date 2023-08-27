package br.com.jsn.springbootapp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{
	
	@Id
	@Column(name="endereco_id")
	private Integer id;
	@Column(name="endereco_logradouro")
	private String logradouro ;
	@Column(name="endereco_bairro")
	private String bairro;
	@Column(name="endereco_cidade")
	private String cidade ;
	@Column(name="endereco_uf")
	private String uf ;
	@Column(name="endereco_cep")
	private String cep;
	@Column(name="endereco_numero")
	private String numero ;
	
	
	public Endereco() {}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
