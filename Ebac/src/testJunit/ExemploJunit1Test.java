package testJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploJunit1Test {

    @Test
    public void teste1() {
        String nome = "Jeff";
        Assertions.assertEquals("Jeff", nome);
    }

    @Test
    public void teste2() {
        String nome = "Jeff";
        Assertions.assertNotEquals("Jorge", nome);
    }
}