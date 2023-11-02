package com.example.demo.Entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String textoPregunta;
    @ManyToOne
    @JoinColumn(name = "encuesta_id")
    private Encuesta encuesta;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
    private List<Respuesta> respuestas = new ArrayList<>();

    //CONSTRUCTOR,
    public Pregunta(){
    }

    //Getters
    public Long getId(){
        return id;
    };
    public String getTextoPregunta(){
        return textoPregunta;
    }
    public Encuesta getEncuesta(){
        return encuesta;
    }
    public List<Respuesta> getRespuestas() {
        return respuestas;
    }


    //Setters
    public void setId(long paramId){
        this.id=paramId;
    }
    public void setTextoPregunta(String paramTexto){
        this.textoPregunta=paramTexto;
    }
    public void setIdEncuesta(long idEncuesta){
        this.encuesta.setId(idEncuesta);
    }
}
