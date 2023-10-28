package com.example.demo.Entidades;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Encuesta {
    private long id;
    private String titulo;
    private Date fecha;


    //CONSTRUCTOR, GETTER Y SETTER
    //constructor por default
    public Encuesta(){

    }

    //Getter
    public Long getId(){
        return id;
    };

    public String getTitulo(){
        return titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    //Setter
    public void setId(long paramId){
        this.id=paramId;
    }

    public void setTitulo(String paramTitulo){
        this.titulo=paramTitulo;
    }

    public void setFecha(Date paramFecha){
        this.fecha=paramFecha;
    }
}
