package com.alkemy.Challenge.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private PeliculaOSerieEntity  titulo;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaOSerieEntity> peliculasoseries = new ArrayList<>();
}
