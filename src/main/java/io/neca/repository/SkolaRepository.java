package io.neca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.neca.model.Skola;

public interface SkolaRepository extends JpaRepository<Skola, String> {

}
