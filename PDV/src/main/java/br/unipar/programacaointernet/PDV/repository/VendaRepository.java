package br.unipar.programacaointernet.PDV.repository;

import br.unipar.programacaointernet.PDV.model.Venda;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class VendaRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Venda> listarVendas() {
        String jpql = "SELECT l FROM Venda l";
        return em.createQuery(jpql, Venda.class).getResultList();
    }

    public Venda buscarPorID(Integer id) {
        return em.find(Venda.class, id);
    }

    public void cadastrar(Venda venda) throws Exception {
        try {
            em.persist(venda);
        } catch (Exception ex) {
            throw new Exception("Venda já feita!");
        }
    }
}
