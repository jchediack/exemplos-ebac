import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();

        cliente.setCodigo("09");
        cliente.setNome("Dany Borges");

        Integer qtd = dao.cadastrar(cliente);
        Assertions.assertTrue(qtd == 1);
/*
        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        Assertions.assertNotNull(clienteBD);
        Assertions.assertNotNull(clienteBD.getId());
        Assertions.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assertions.assertEquals(cliente.getNome(), clienteBD.getNome());

 */
    }

}
