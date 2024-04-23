package br.unipar.programacaointernet.PDV.repository;

import br.unipar.programacaointernet.PDV.model.ItensVenda;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class ItensVendaRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<ItensVenda> litarItensVenda() {

        String jpql = "SELECT e FROM ItensVenda e";
        return em.createQuery(jpql, ItensVenda.class).getResultList();
    }

    public ItensVenda buscarPorID(Integer id) {
        return em.find(ItensVenda.class, id);
    }

    public void cadastrar(ItensVenda itensVenda) throws Exception {
        try {
            em.persist(itensVenda);
        } catch (Exception ex) {
            throw new Exception("O item na venda não pode ser cadastrado");
        }
    }
}
