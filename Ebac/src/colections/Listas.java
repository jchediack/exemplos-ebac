package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        exemploListaSimples();

    }
        private static void exemploListaSimples() {
            System.out.println("******************* Exemplo de Lista Simples *******************");
            List<String> lista = new ArrayList<String>();

            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            System.out.println(lista);
            System.out.println("");
            System.out.println("******************* Exemplo de Lista Simples Ordem Ascendente *******************");
            Collections.sort(lista);    // Organiza a lista em Ordem Alfabetica
            System.out.println(lista);
            System.out.println("");
        }
}
