package tarefamod23;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class TesteFemininoTest {
    @Test

    public void testeFeminino1() {
        Pessoa pessoa = new Pessoa();
        pessoa.adicionarSexo("Feminino");
        Assert.assertEquals("Feminino", pessoa.getSexo());


    }
}