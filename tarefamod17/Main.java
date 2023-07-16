package tarefamod17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Honda honda = new Honda();
        Fiat fiat = new Fiat();

        List<Carros> lista = new ArrayList<>();
        lista.add(honda);
        lista.add(fiat);

        for (Carros carros: lista){
            carros.modeloCarro();
        }

    }
}
