package com.nosde.mareestudos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosde.mareestudos.domain.entity.Plano;

public interface PlanoRepository extends JpaRepository<Plano, UUID> {
}
