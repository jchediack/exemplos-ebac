package reflections;

import diversos.Cliente;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AppReflections {
    public static void main(String []args){

        Class classe  = Produto.class;
        System.out.println(classe);
        Class<Anotacao> classe2 = Anotacao.class;
        Tabela tabela = classe2.getAnnotation(Tabela.class);
        System.out.println(tabela);

    }
}
