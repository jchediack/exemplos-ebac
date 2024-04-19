package generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); // Generico <>
        lista.add("Jeff");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(255l);
        listaLong.add(500l);
        imprimir(listaLong);

    }

    public static <T> void imprimir(List<T> lista) { // Metodo generico <>
        for (T st: lista) {
            System.out.println(st);
        }
    }
}
