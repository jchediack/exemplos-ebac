package diversos;

public class Condicionais {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            System.out.println("Valor " + i);

            if (i == 10) {
                System.out.println("Programa encerrado no num " + i);
                break;
            }
        }
        for (int contador = 1; contador <= 100; contador++) {
            if (contador%5!=0) {    // Apenas numeros multiplos de 5
                continue;   // O programa retorna para o inicio do For (não executa nada abaixo)
            }
            System.out.println("Contador " + contador);
        }

        int valor = 0;
        while (valor < 10) {
            System.out.println("Contador do while = " + valor);
            valor++;
        }
        String animal = "DoOG";
        switch (animal){
            case "CAT":
                System.out.println("Gato");
                break;
            case "DOG":
                System.out.println("Cachorro");
                break;
            case "TIGER":
                System.out.println("Tigre");
                break;
            default:
                System.out.println("Não identificado");
                break;
        }

    }
}
