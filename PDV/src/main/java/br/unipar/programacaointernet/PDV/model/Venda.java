package br.unipar.programacaointernet.PDV.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Venda {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer integer;

        @Column(length = 60)
        private double total;

        @Column(length = 60)
        private String observacoes;

        @ManyToOne
        private Cliente cliente;
}
