package streams;

import java.util.List;

public class ExemplosCount {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        long contador = pessoas.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("S"))
                .count();
        System.out.println(contador);

    }
}
