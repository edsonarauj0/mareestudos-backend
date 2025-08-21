package com.nosde.mareestudos.domain.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "planos_disciplinas")
@Data
public class PlanoDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer ordem;

    private String corHex;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Plano plano;

    @ManyToOne(fetch = FetchType.LAZY)
    private DisciplinaCatalogo disciplinaCatalogo;

    @OneToMany(mappedBy = "planoDisciplina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlanoTopico> topicos;

    @OneToMany(mappedBy = "planoDisciplina")
    private List<SessaoEstudo> sessoes;

    @OneToMany(mappedBy = "planoDisciplina")
    private List<ResolucaoQuestao> resolucoes;
}
