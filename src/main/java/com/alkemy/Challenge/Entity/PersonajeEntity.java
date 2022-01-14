package com.alkemy.Challenge.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "personaje")
@Getter
@Setter

public class PersonajeEntity {

    private String imagen;

    private String nombre;

    private int edad;

    private double peso;

    private String historia;

    @Column (name = "peliculas_o_series_asociadas")
    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "titulo", insertable = false, updatable = false)
    private PeliculaOSerieEntity  titulo;
}
