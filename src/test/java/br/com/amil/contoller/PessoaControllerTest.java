package br.com.amil.contoller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PessoaControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new PessoaController(null, null, null));
 	}
}
