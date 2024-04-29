package exceptions.Nelio;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        double valorTotal = 1000;
        double entrada = 250;
        int parcelas = 10;

        try {
            Financiamento financiamento = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println("Valor das prestações: " + financiamento.prestacao());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
