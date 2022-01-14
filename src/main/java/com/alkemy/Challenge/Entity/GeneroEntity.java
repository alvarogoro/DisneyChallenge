package com.alkemy.Challenge.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
@Getter
@Setter

public class GeneroEntity {
    private String nombre;

    private String imagen;

    @OneToMany (mappedBy = "genero", cascade = CascadeType.ALL)
    private List<PeliculaOSerieEntity> peliculas_o_series;


    @Column(name = "peliculas_o_series_ asociadas")
    private String peliculasOSeriesAsociadas;
}
