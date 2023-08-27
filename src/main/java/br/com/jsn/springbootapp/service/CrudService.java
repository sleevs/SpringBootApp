package br.com.jsn.springbootapp.service;

public interface CrudService <E> {
	
	public String  criar(E data);	
	public String listar();
	public String encontrar(Integer id);
	public void deletar(Integer id);
	public String atualizar(E data);

}
