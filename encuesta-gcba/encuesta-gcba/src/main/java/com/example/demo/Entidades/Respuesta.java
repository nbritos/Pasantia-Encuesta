package com.example.demo.Entidades;

import javax.persistence.*;

@Entity
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textoRespuesta;
    @ManyToOne
    @JoinColumn(name="pregunta_id")
    private Pregunta pregunta;

    //
    public Respuesta(){

    }
    //Getters
    public long getId(){
        return id;
    }

    public String getTextoRespuesta(){
        return textoRespuesta;
    }

    public Pregunta getPregunta(){
        return pregunta;
    }

    //Setters
    public void setId(long paramId){
        this.id=paramId;
    }

    public void setTextoRespuesta(String paramTextoRespuesta){
        this.textoRespuesta=paramTextoRespuesta;
    }

    public void setIdPregunta(long paramIdPregunta){
        this.pregunta.setId(paramIdPregunta);
    }
}
