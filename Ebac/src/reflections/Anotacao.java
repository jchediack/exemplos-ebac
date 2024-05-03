package reflections;
import tarefa18.Tabela;

@Tabela(nomeTabela = "Cliente")
public class Anotacao {

    Class clazz = reflections.Tabela.class;
    System.out.println(clazz);

}
