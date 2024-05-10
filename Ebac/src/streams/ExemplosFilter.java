package streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosFilter {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Grecia"));

        System.out.println(stream);
    }
}
