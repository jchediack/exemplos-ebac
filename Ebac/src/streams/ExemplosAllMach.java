package streams;

import java.util.List;

public class ExemplosAllMach {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        boolean result = pessoas.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        System.out.println(result);

    }

}
