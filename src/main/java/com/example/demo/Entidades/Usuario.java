package com.example.demo.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dni;
    private long idCarrera;

    //CONSTRUCTOR, GETTER Y SETTER
    //constructor por default
    public Usuario(){

    }

    //Getter
    public Long getDni(){
        return dni;
    }

    public long getCarrera(){
        return idCarrera;
    }

    //Setter
    public void setDni(long paramDni){
        this.dni=paramDni;
    }

    public void setCarrera(long paramCarrera){
        this.idCarrera=paramCarrera;
    }
}
