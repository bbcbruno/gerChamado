package br.com.amil.repository;

import java.util.List;

import br.com.amil.model.Chamado;

public interface ChamadoRepository {
	 
	void create(Chamado entity);
	
	Chamado update(Chamado entity);
	
	void destroy(Chamado entity);
	
	Chamado find(Long id);
	
	List<Chamado> findAll();

}
