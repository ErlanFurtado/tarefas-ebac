package furtado.erlan;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import furtado.erlan.dao.ImatriculaDao;
import furtado.erlan.dao.MatriculaDao;
import furtado.erlan.dominio.Matricula;

public class MatriculaTest {
	
	private ImatriculaDao matriculaDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
	}
	
	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A");
		mat.setDataMatriculua(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(1000D);
		matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}

}
