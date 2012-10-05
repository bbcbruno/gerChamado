package br.com.amil.contoller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ChamadoControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ChamadoController(null, null, null));
 	}
}
