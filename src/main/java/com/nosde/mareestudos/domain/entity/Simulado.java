package com.nosde.mareestudos.domain.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "simulados")
@Data
public class Simulado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    private LocalDate data;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Plano plano;

    @OneToMany(mappedBy = "simulado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SimuladoQuestao> itens;
}
