package com.nosde.mareestudos.domain.entity;

import java.time.Instant;
import java.util.UUID;

import com.nosde.mareestudos.domain.enums.TipoSessao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sessoes_estudo")
@Data
public class SessaoEstudo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private Instant inicio;

    @Column(nullable = false)
    private Instant fim;

    @Column(nullable = false)
    private Integer duracaoMin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoSessao tipo;

    private String observacoes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Plano plano;

    @ManyToOne(fetch = FetchType.LAZY)
    private PlanoDisciplina planoDisciplina;

    @ManyToOne(fetch = FetchType.LAZY)
    private PlanoTopico planoTopico;
}
