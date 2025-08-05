package com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta02.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Matricula {
    @Id
    private Long id;
    @ManyToOne
    private Alumno alumno;
    @ManyToOne
    private Curso curso;
}
