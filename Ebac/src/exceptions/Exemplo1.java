package exceptions;

import java.io.UncheckedIOException;

public class Exemplo1 {

    public static void main(String[] args) {

        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) { // Nunca deve tratar esse tipo de erro, isso é apenas um exemplo
            System.out.println("************ Frase Vazia ************");
            frase = "Frase Vazia";
            novaFrase = frase.toLowerCase();
        }

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
// Unchecked Exception -> não há como contornar a exceção
// Unchecked Exception -> existe como contornar a exceção
