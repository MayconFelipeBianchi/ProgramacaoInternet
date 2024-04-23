package br.unipar.programacaointernet.PDV.repository;


import br.unipar.programacaointernet.PDV.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class ClienteRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Cliente> listarClientes() {
        String jpql = "SELECT l FROM Cliente l";
        return em.createQuery(jpql, Cliente.class).getResultList();
    }

    public Cliente buscarPorID(Integer id) {
        return em.find(Cliente.class, id);
    }

    public void cadastrar(Cliente cliente) throws Exception {
        try {
            em.persist(cliente);
        } catch (Exception ex) {
            throw new Exception("Cliente já existe!");
        }
    }
}
