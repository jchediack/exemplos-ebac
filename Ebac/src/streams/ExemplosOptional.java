package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOptional {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Optional<Pessoa> max = pessoas.stream()
                .max(Comparator.comparing(Pessoa::getIdade));
        if (max.isPresent()) {
            System.out.println(max.get());
        }
        //Mesmo comando de cima
        max.ifPresent(System.out::println);

        System.out.println("*******************");

        Optional<Pessoa> min = pessoas.stream()
                .min(Comparator.comparing(Pessoa::getIdade));
        min.ifPresent(System.out::println);
    }
}
