package annotation;

@PrimeiraAnotacao(value = "JC", bairros = "Eldorado", numeroCasa = 64)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Jeff", bairros = {"Eldorado", "Jardim Industrial"}, numeroCasa = 64, valores = 50d)
    String nome;

}
