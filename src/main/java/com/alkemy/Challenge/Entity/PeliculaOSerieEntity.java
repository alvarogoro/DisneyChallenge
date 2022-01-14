package com.alkemy.Challenge.Entity;

import javax.persistence.*;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "peliculas_o_series")
@Getter
@Setter

public class PeliculaOSerieEntity {

    private String imagen;

    private String titulo;

    @Column (name = "fecha_de_creacion")
    @DateTimeFormat(pattern = "dd/mm/yyyy" )
    private LocalDate fechaDeCreacion;

    private int calificacion;

    @Column (name = "personajes_asociados")
    private String personajesAsociados;

}
