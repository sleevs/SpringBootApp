package br.com.jsn.springbootapp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cadastro")
public class Cadastro implements Serializable{
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="cadastro_id")
	@Id
	private Integer id;
	@Column(name ="cadastro_nome")
	private String nome ;
	@Column(name ="cadastro_tipo")
	private String tipo ;
	@Column(name ="cadastro_email")
	private String email ;
	@Column(name ="cadastro_telefone")
	private String telefone;
	
	
	public Cadastro() {}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
}
