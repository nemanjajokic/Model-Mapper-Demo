package io.neca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.neca.model.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, String> {

}
