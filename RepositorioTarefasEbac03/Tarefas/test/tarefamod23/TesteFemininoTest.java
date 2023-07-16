package tarefamod23;

import org.junit.Assert;
import org.junit.Test;
import tarefamod23.Pessoa;

import static org.junit.Assert.*;

public class TesteFemininoTest {
    @Test

    public void testeFeminino(){
        Pessoa pessoa = new Pessoa();
        pessoa.adicionarSexo("Feminino");
        Assert.assertEquals("Feminino", pessoa.getSexo());
    }

}