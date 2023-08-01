package furtado.erlan;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import furtado.erlan.dao.CursoDao;
import furtado.erlan.dao.ICursoDao;
import furtado.erlan.dominio.Curso;

public class CursoTest {
	
	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}
	

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Java Backend");
		curso = cursoDao.Cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
		
	}
}
