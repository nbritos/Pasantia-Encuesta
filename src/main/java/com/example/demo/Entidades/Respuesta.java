package com.example.demo.Entidades;

import javax.persistence.Entity;

@Entity
public class Respuesta {
    private long id;
    private String textoRespuesta;
    private Pregunta idPregunta;

    //
    public Respuesta(){

    }
    //
    public long getId(){
        return id;
    }

    public String getTextoRespuesta(){
        return textoRespuesta;
    }

    public Pregunta getIdPregunta(){
        return idPregunta;
    }
    //

    public void setId(long paramId){
        this.id=paramId;
    }

    public void setTextoRespuesta(String paramTextoRespuesta){
        this.textoRespuesta=paramTextoRespuesta;
    }

    public void setIdPregunta(long paramIdPregunta){
        this.idPregunta.setId(paramIdPregunta);
    }
}
