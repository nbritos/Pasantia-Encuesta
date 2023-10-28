package com.example.demo.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
@Entity
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String textoRespuesta;
    @ManyToOne
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
