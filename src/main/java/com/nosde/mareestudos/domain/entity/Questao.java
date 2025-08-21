package com.nosde.mareestudos.domain.entity;

import java.util.List;
import java.util.UUID;

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
@Table(name = "questoes")
@Data
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String fonte;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String enunciado;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String alternativasJson;

    @Column(nullable = false)
    private String gabaritoId;

    @ManyToOne(fetch = FetchType.LAZY)
    private DisciplinaCatalogo disciplina;

    @ManyToOne(fetch = FetchType.LAZY)
    private TopicoCatalogo topico;

    @OneToMany(mappedBy = "questao")
    private List<ResolucaoQuestao> resolucoes;

    @OneToMany(mappedBy = "questao")
    private List<SimuladoQuestao> simulados;
}
