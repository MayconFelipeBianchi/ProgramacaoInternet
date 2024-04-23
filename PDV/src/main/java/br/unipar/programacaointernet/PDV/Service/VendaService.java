package br.unipar.programacaointernet.PDV.Service;


import br.unipar.programacaointernet.PDV.model.Venda;
import br.unipar.programacaointernet.PDV.repository.VendaRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class VendaService {
    @Inject
    private VendaRepository vendaRepository;

    public List<Venda> listar() {
        return vendaRepository.listarVendas();
    }
    public void cadastrar(Venda venda) throws Exception {
        vendaRepository.cadastrar(venda);
    }
}
