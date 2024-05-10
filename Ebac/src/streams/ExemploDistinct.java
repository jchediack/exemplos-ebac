package streams;

import java.util.List;
import java.util.stream.Stream;

// Não repete dados
public class ExemploDistinct {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        // Usa o Equals e HashCode -> coloquei ID e Nome para diferenciar
        Stream<Pessoa> streamDist1 = pessoas.stream().distinct();


    }
}
