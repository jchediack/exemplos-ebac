package mod25ExemploVendas;

public interface IClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);

}
