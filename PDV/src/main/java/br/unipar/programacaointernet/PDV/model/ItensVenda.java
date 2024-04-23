package br.unipar.programacaointernet.PDV.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class ItensVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer integer;

    @Column(length = 60)
    private double valorUnitario;

    @Column(length = 60)
    private double valorTotal;

    @Column(length = 60)
    private double quantidade;

    @OneToMany (mappedBy = "venda", orphanRemoval = true)
    private List <ItensVenda> itensVendas;

    @OneToMany (mappedBy = "produto", orphanRemoval = true)
    private List <Produto> produtos;
}
