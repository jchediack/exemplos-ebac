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
        listaLong.add(255L);
        listaLong.add(500L);
        imprimir(listaLong);
        System.out.println("*******************");
        String st1 = retornaPrimeiro(lista);
        System.out.println(st1);
        Long st2 = retornaPrimeiro(listaLong);
        System.out.println(st2);
    }

    public static <T> void imprimir(List<T> lista) { // Metodo generico <>
        for (T st: lista) {
            System.out.println(st);
        }
    }
    public static <T> T retornaPrimeiro(List<T> lista) {
        return lista.getFirst();
    }
}
