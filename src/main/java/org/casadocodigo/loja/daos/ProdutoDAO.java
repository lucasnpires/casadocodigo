package org.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.casadocodigo.loja.models.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void gravar(Produto produto){
		entityManager.persist(produto);
	}

	public List<Produto> listar() {
		return entityManager.createQuery("select p from Produto p", Produto.class).getResultList();
	}

}
