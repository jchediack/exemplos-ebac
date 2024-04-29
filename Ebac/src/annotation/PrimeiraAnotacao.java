package annotation;

import java.lang.annotation.*;

@Documented // Serve para aparecer na documentação do JavaDoc
@Retention(RetentionPolicy.RUNTIME) //Consegue acessá-la em tempo de execução
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface PrimeiraAnotacao {

    String value();
    String[] bairros();
    long numeroCasa();
    double valores() default 10d;

}
