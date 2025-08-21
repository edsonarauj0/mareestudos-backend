package com.nosde.mareestudos.domain.entity;

import java.util.UUID;

import com.nosde.mareestudos.domain.enums.StatusTopicoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "topicos_catalogo")
@Data
public class TopicoCatalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusTopicoEnum status;

    @ManyToOne(optional = false)
    private DisciplinaCatalogo disciplina;

    @Column(nullable = false)
    private String descricao;
}