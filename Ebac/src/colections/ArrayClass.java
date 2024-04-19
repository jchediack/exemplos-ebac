package colections;

public class ArrayClass {
    public static void main(String[] args) {
        declaracaoArray();
        arrayBidimensional();
    }

private static void declaracaoArray() {
    System.out.println("****************** Declaração de Array ******************");
    int[] a = new int[4];
    int[] r = new int[44], k = new int[23];
    int[] iniciaValores = {12, 32, 44, 54, 78, 69, 39, 34, 76};
    int[] meuArray;
    meuArray = new int[10];

    meuArray[0] = 15;
    meuArray[1] = 100;
    meuArray[2] = 52;
    meuArray[3] = 753;
    meuArray[4] = 951;
    meuArray[5] = 852;
    meuArray[6] = 123;
    meuArray[7] = 654;
    meuArray[8] = 542;
    meuArray[9] = 125;

    System.out.println(meuArray[3]);
    System.out.println(meuArray[9]);
    System.out.println(meuArray.length);

    System.out.println("****************** Percorrendo o Array ******************");
    for(int i=0; i < meuArray.length; i++) {
        System.out.println(meuArray[i]);
    }

    System.out.println("****************** Somatória do Array ******************");
    int total = 0;
    for(int i : meuArray) {
        total += i;
    }
    System.out.println(total);
}
private static void arrayBidimensional() {
    System.out.println("****************** Array Bidimensional ******************");
    int [][] array1 = { { 1,2,3}, {4,5,6,}};
    int [][] array2 = { { 1,2}, {3, 7, 7, 9, 45}, {4,5,6}};
    System.out.println("Valores no array1 passados na linha são: ");
    outputArray (array1);
    System.out.println("Valores no array2 passados na linha são: ");
    outputArray (array2);
}
private static void outputArray(int [] [] array) {
        // Percorre as linhas do Arrau
        for(int linha = 0; linha <array.length; linha ++) {
            // Percorre a coluna do Array
            for(int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha] [coluna] );
            }
            System.out.println();
        }
}
}