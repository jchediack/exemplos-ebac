package streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Esse MAP é diferente do MAP de Coleções
public class ExemplosMap {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Integer> streamMap = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream streamInt = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);

    }
}
