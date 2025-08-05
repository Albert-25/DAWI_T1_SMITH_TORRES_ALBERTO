package com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta02.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Alumno {
    @Id
    private Long id;
    private String nombre;
    private int email;
}
