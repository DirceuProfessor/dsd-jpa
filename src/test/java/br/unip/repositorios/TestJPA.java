package br.unip.repositorios;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.unip.modelos.Cidade;
import br.unip.repositorios.RepositorioCidade;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-beans.xml" })
public class TestJPA {

	@Autowired
	private RepositorioCidade cidadeRepo;

	@Test
	public void testInsert(){
		assertEquals(0l,cidadeRepo.count()); 
		cidadeRepo.save(new Cidade(1l,"São Paulo"));
		assertEquals(1l,cidadeRepo.count());
		System.out.println("aaa");
	}

}
