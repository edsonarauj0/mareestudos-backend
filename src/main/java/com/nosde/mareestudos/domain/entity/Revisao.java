package com.nosde.mareestudos.domain.entity;

import java.time.Instant;
import java.time.LocalDate;
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
@Table(name = "revisoes")
@Data
public class Revisao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDate agendadaPara;

    private Instant concluidaEm;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PlanoTopico planoTopico;
}
