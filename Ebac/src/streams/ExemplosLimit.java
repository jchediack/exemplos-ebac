package streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosLimit {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        // Limita apenas para 2 pessoas da lista
        Stream<Pessoa> streamLimite = pessoas.stream().limit(2);

    }
}
