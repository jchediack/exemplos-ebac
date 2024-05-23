package mod25ExemploVendas;

public class ClienteDaoMock implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
