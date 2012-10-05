package br.com.amil.contoller;

import java.util.List;

import br.com.amil.model.Pessoa;
import br.com.amil.repository.PessoaRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PessoaController {

	private final Result result;
	private final PessoaRepository repository;
	private final Validator validator;
	
	PessoaController(Result result, PessoaRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Get("/pessoas")
	public List<Pessoa> index() {
		return repository.findAll();
	}
	
	@Post("/pessoas")
	public void create(Pessoa pessoa) {
		validator.validate(pessoa);
		validator.onErrorUsePageOf(this).newPessoa();
		repository.create(pessoa);
		result.redirectTo(this).index();
	}
	
	@Get("/pessoas/new")
	public Pessoa newPessoa() {
		return new Pessoa();
	}
	
	@Put("/pessoas")
	public void update(Pessoa pessoa) {
		validator.validate(pessoa);
		validator.onErrorUsePageOf(this).edit(pessoa);
		repository.update(pessoa);
		result.redirectTo(this).index();
	}
	
	@Get("/pessoas/{pessoa.id}/edit")
	public Pessoa edit(Pessoa pessoa) {
		return repository.find(pessoa.getId());
	}

	@Get("/pessoas/{pessoa.id}")
	public Pessoa show(Pessoa pessoa) {
		return repository.find(pessoa.getId());
	}

	@Delete("/pessoas/{pessoa.id}")
	public void destroy(Pessoa pessoa) {
		repository.destroy(repository.find(pessoa.getId()));
		result.redirectTo(this).index();  
	}
}