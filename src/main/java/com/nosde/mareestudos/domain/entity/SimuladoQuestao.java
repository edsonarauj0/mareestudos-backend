package com.nosde.mareestudos.domain.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "simulado_questoes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"simulado_id", "ordem"})
})
@Data
public class SimuladoQuestao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Integer ordem;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Simulado simulado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Questao questao;
}
