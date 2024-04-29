package exceptions.Nelio;

public class Financiamento {

    public Double valorTotal;
    public Double entrada;
    public Integer parcelas;

    public Financiamento(Double valorTotal, Double entrada, Integer parcelas) {
        if (entrada < valorTotal * 0.2) {
            throw new RuntimeException("A entrada deve ser maior que 20%");
        } else if (parcelas < 6) {
            throw new RuntimeException("O numero minimo de parcelas devem ser 6 parcelas");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao() {
        return (valorTotal - entrada) / parcelas;
    }
}
