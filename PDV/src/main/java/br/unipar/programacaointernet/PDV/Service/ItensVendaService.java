package br.unipar.programacaointernet.PDV.Service;

import br.unipar.programacaointernet.PDV.model.ItensVenda;
import br.unipar.programacaointernet.PDV.repository.ItensVendaRepository;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ItensVendaService {
    @Inject
    private ItensVendaRepository itensVendaRepository;

    public List<ItensVenda> listar() {
        return itensVendaRepository.litarItensVenda();
    }
    public void cadastrar(ItensVenda itensVenda) throws Exception {
        itensVendaRepository.cadastrar(itensVenda);
    }
}
