package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented // Serve para aparecer na documentação do JavaDoc
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimeiraAnotacao {

}
