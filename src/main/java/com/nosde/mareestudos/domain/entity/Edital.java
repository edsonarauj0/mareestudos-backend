package com.nosde.mareestudos.domain.entity;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "editais")
@Data
public class Edital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    private String instituicao;

    private Integer ano;

    private LocalDate dataPublicacao;

    private String versao;

    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private Instant updatedAt;
    
    @OneToMany(mappedBy = "edital", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cargo> cargos;

    @OneToMany(mappedBy = "edital", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DisciplinaCatalogo> disciplinas;
}
