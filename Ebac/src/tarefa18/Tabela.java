package tarefa18;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
        String value();

        String nomeTabela();
}
