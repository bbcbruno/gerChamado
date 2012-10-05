package br.com.amil.contoller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
@Path("/")
public class IndexController {
	
	private Result result;

	public IndexController(Result result) {
		this.result = result;
	}

	@Get("")
	public void index(){
		result.redirectTo(ChamadoController.class).index();
	}

}
