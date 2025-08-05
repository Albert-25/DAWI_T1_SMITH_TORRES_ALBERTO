package com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta02.repository;

import com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta02.models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Long> {

    @Query("""
            select m, a from Matricula m
            join m.alumno a
            where a.email = :email
            """)
    List<Matricula> findByAlumnoEmail(String email);
}
