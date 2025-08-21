package com.nosde.mareestudos.domain.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "resolucoes_questoes")
@Data
public class ResolucaoQuestao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private boolean correta;

    private Integer tempoSeg;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Plano plano;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Questao questao;

    @ManyToOne(fetch = FetchType.LAZY)
    private SessaoEstudo sessao;

    @ManyToOne(fetch = FetchType.LAZY)
    private PlanoDisciplina planoDisciplina;

    @ManyToOne(fetch = FetchType.LAZY)
    private PlanoTopico planoTopico;
}
