package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// Sorted = Ordenar
public class ExemplosSorted {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Pessoa> streamNome1 = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> streamNome2 = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> streamNome3 = pessoas.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));



    }

}
