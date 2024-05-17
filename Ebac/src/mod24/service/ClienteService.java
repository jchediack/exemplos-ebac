package mod24.service;

import mod24.dao.ClienteDao;

public class ClienteService {

    private ClienteDao clienteDao;

    public ClienteService() {
        clienteDao = new ClienteDao();
    }

    public String salvar() {
        return "Sucesso";
    }
}
