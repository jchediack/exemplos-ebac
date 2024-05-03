package reflections;

public class Produto {

    private Long Codigo;
    private String descricao;
    private Double valor;

    public Produto() {

    }

    public Long getCodigo() {
        return Codigo;
    }

    public void setCodigo(Long codigo) {
        Codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
