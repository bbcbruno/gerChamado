package br.com.amil.contoller;

import java.util.List;

import br.com.amil.model.Chamado;
import br.com.amil.repository.ChamadoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ChamadoController {

	private final Result result;
	private final ChamadoRepository repository;
	private final Validator validator;
	
	ChamadoController(Result result, ChamadoRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Get("/chamados")
	public List<Chamado> index() {
		return repository.findAll();
	}
	
	@Post("/chamados")
	public void create(Chamado chamado) {
		validator.validate(chamado);
		validator.onErrorUsePageOf(this).newChamado();
		repository.create(chamado);
		result.redirectTo(this).index();
	}
	
	@Get("/chamados/new")
	public Chamado newChamado() {
		return new Chamado();
	}
	
	@Put("/chamados")
	public void update(Chamado chamado) {
		validator.validate(chamado);
		validator.onErrorUsePageOf(this).edit(chamado);
		repository.update(chamado);
		result.redirectTo(this).index();
	}
	
	@Get("/chamados/{chamado.id}/edit")
	public Chamado edit(Chamado chamado) {
		return repository.find(chamado.getId());
	}

	@Get("/chamados/{chamado.id}")
	public Chamado show(Chamado chamado) {
		return repository.find(chamado.getId());
	}

	@Delete("/chamados/{chamado.id}")
	public void destroy(Chamado chamado) {
		repository.destroy(repository.find(chamado.getId()));
		result.redirectTo(this).index();  
	}
}