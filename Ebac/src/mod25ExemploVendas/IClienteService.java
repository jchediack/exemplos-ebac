package mod25ExemploVendas;

public interface IClienteService {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

}
