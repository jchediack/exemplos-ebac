package coleções;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();

    }

    private static void exemploNumeros() {
        System.out.println("********* Exemplo de Lista com Numeros *********");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(2);
        numeros.add(10);
        numeros.add(25);
        System.out.println(numeros);
        System.out.println(" ");

    }

    private static void exemploListaSimples() {
        System.out.println("********* Exemplo de Lista Simples *********");
        List<String> nomes = new ArrayList<>();
        nomes.add("Jorge Chediack");
        nomes.add("Jeff");
        nomes.add("Amor");
        System.out.println(nomes);
        System.out.println(" ");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("********* Exemplo de Lista Simples em Ordem Ascendente *********");
        List<String> nomes = new ArrayList<>();
        nomes.add("Jorge Chediack");
        nomes.add("Jeff");
        nomes.add("Amor");
        Collections.sort(nomes);    // "Collections" é uma Classe e não a Interface "Collection"
        System.out.println(nomes);
        System.out.println(" ");
    }
}
