package com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta02.repository;

import com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta02.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
    @Query("""
            select c from Curso c
            where c.nombre like %:nombre%
            """)
    List<Curso> findLikeNombre(String nombre);
}
