package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemplosCollect {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())   // Cria uma Lista de Pessoas
                .forEach(System.out::println);

        System.out.println("*******************");

        Map<String, Integer> gruporPorNacionalidadeSomadosPorIdade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade, Collectors.summingInt(Pessoa::getIdade)));
        System.out.println(gruporPorNacionalidadeSomadosPorIdade);

    }
}
