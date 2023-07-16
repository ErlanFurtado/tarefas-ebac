package tarefamod22;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Listas {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        Collection<Pessoa> listaTotal = lista.stream()
                .collect(Collectors.toList());

        listaTotal.forEach(System.out::println);
        System.out.println("");
        System.out.println("********** LISTA FILTRADA POR FEMININO **********");
        System.out.println("");

        List<Pessoa> listaTotal1 = lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());
        listaTotal1.forEach(System.out::println);

    }
}
