package com.cibertec.DAWI_T1_ALBERTO_SMITH_TORRES.pregunta01.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Tecnico extends Persona {
    private String especialidad;
    private String certificado;
}
