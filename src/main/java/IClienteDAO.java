public interface IClienteDAO {
    public Integer cadastrar(Cliente cliente) throws Exception;
    public Cliente consultar(String codigo) throws Exception;

}