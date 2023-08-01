package furtado.erlan.dao;

import java.util.List;

import furtado.erlan.dominio.Curso;
import furtado.erlan.dominio.Matricula;
import furtado.erlan.dominio.Produto;

public interface IProdutoDao {
	
	
	  Produto cadastrar( Produto produto);
	    Produto buscarPorCodCurso ( String codigoCurso);
	    Produto buscarPorCurso (Curso curso);

	    Produto buscarPorCodMatricula ( String codigoMatricula);
	    Produto buscarPorMatricula (Matricula matricula);

	    List<Produto> buscarTodos();
	    void excluir(Produto produto);
}
