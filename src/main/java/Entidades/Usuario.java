package Entidades;

import javax.persistence.Entity;

@Entity
//entidades
public class Usuario {

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
