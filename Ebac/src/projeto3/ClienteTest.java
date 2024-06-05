package projeto3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("11");
        cliente.setNome("Jeff");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assertions.assertTrue(countCad == 1);

    }
}
