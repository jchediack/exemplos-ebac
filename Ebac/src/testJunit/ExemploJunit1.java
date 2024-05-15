package testJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploJunit1 {

    @Test
    public void teste2() {
        String nome = "Jeff";
        Assertions.assertNotEquals("Jorge", nome);
    }

}
