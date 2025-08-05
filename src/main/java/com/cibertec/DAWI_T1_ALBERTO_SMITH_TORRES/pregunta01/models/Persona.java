package com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta01.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
}
