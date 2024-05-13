package streams;

import java.util.List;

public class ExemplosForEach {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));
        System.out.println("**************");
        pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println(pessoa));

        System.out.println("**************");
        pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(pessoa -> System.out.println(pessoa));
    }
}
