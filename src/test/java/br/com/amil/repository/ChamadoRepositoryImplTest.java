package br.com.amil.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ChamadoRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new ChamadoRepositoryImpl(null));
  	}
}

