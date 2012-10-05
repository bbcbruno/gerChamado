package br.com.amil.repository;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.amil.model.Pessoa;

@Component
public class PessoaRepositoryImpl
    extends Repository<Pessoa, Long>
    implements PessoaRepository {

	PessoaRepositoryImpl(Session session) {
		super(session);
	}
}
