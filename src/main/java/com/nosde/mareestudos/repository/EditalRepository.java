package com.nosde.mareestudos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosde.mareestudos.domain.entity.Edital;

public interface EditalRepository extends JpaRepository<Edital, UUID> {
}
