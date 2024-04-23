package br.unipar.programacaointernet.PDV.Service;

import br.unipar.programacaointernet.PDV.model.Produto;
import br.unipar.programacaointernet.PDV.repository.ProdutoRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ProdutoService {
    @Inject
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        return produtoRepository.listarTodos();
    }
    public void cadastrar(Produto produto) throws Exception {
        produtoRepository.cadastrar(produto);
    }
}
