package com.example.demo.Entidades;

import javax.persistence.Entity;

@Entity
public class Carrera {
    private long id;
    private String descripcionCarrera;

    //
    public Carrera(){

    }

    //
    public long getId(){
        return id;
    }

    public String getDescripcionCarrera(){
        return descripcionCarrera;
    }

    //
    public void setId(long paramId){
        this.id=paramId;
    }

    public void setDescripcionCarrera(String paramDescripcion){
        this.descripcionCarrera=paramDescripcion;
    }

}
