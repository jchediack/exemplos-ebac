package colections;

import java.util.Scanner;

public class OrdenaVetorDinamico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os números separados por vírgula");

        String resposta = s.next();
        String[] vetStr = resposta.split(",");
        int[] vet = convert(vetStr);
        int aux = 0;
        int i = 0;

        System.out.println("Vetor Desordenado");
        for(i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println(" ");
        // Oganiza vetor
        for( i = 0; i < vet.length; i ++) {
            for(int j = 0; j < vet.length - 1; j ++) {
                if(vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor Ordenado");
        for(i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
    // Função que converte Vetor String em Int
    private static int[] convert(String[] vetStr) {
        int[] numbers = new int[vetStr.length];
        for(int i = 0; i < vetStr.length; i++) {
            numbers[i] = Integer.parseInt(vetStr[i]);
        }
        return numbers;
    }
}
