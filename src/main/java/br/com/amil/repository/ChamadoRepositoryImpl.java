package br.com.amil.repository;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.amil.model.Chamado;

@Component
public class ChamadoRepositoryImpl extends Repository<Chamado, Long> implements
		ChamadoRepository {

	ChamadoRepositoryImpl(Session session) {
		super(session);
	}
}
