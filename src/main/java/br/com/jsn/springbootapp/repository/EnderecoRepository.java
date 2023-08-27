package br.com.jsn.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.jsn.springbootapp.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	@Query(value="SELECT * FROM endereco c WHERE c.endereco_id = ?1", nativeQuery=true)
	public Endereco buscarEndereco(Integer id);

}
