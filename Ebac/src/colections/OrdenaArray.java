package colections;

public class OrdenaArray {
    public static void main(String args[]) {
        int[] vet = {8, 9, 3, 5, 1, 22, 12, 21, 33, 4, 2};
        int aux = 0;
        int i = 0;

        System.out.println("Vetor Desordenado: ");
        for(i=0; i< vet.length; i++) {
            System.out.println(" "+ vet[i]);
        }
        System.out.println(" "); // Desce uma linha

        // Organiza o Vetor
        for(i=0; i< vet.length; i++) {
            for(int j = 0; j < vet.length-1; j++) {
                if(vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j +1];
                    vet[j +1] = aux;
                }
            }
        }
        System.out.println("Vetor Organizado");
        for(i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
    }
}
