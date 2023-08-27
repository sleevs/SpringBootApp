package br.com.jsn.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.jsn.springbootapp.entity.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

	@Query(value="SELECT * FROM cadastro c WHERE c.cadastro_id = ?1", nativeQuery=true)
	public Cadastro buscarCadastro(Integer id);
}
