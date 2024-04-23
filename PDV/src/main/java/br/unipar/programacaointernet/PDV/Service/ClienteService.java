package br.unipar.programacaointernet.PDV.Service;


import br.unipar.programacaointernet.PDV.model.Cliente;
import br.unipar.programacaointernet.PDV.repository.ClienteRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ClienteService {
    @Inject
    private ClienteRepository clienteRepository;

    public List<Cliente> listar() {
        return clienteRepository.listarClientes();
    }
    public void cadastrar(Cliente cliente) throws Exception {
        clienteRepository.cadastrar(cliente);
    }
}
