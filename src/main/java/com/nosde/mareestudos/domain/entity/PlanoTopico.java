package com.nosde.mareestudos.domain.entity;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import com.nosde.mareestudos.domain.enums.StatusTopico;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "planos_topicos")
@Data
public class PlanoTopico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String numero;

    @Column(nullable = false)
    private String titulo;

    private String descricao;

    @Column(nullable = false)
    private Integer ordem;

    private String linkMaterial;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusTopico status = StatusTopico.PENDENTE;

    private Instant ultimoEstudoEm;
    private Instant concluidoEm;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PlanoDisciplina planoDisciplina;

    @ManyToOne(fetch = FetchType.LAZY)
    private TopicoCatalogo topicoCatalogo;

    @OneToMany(mappedBy = "planoTopico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Revisao> revisoes;

    @OneToMany(mappedBy = "planoTopico")
    private List<SessaoEstudo> sessoes;

    @OneToMany(mappedBy = "planoTopico")
    private List<ResolucaoQuestao> resolucoes;
}
