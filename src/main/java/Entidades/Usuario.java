package Entidades;

import javax.persistence.Entity;

@Entity
public class Usuario {

    private long dni;
    private Carrera idCarrera;

    //CONSTRUCTOR, GETTER Y SETTER
    //constructor por default
    public Usuario(){

    }

    //Getter
    public Long getDni(){
        return dni;
    }

    public Carrera getCarrera(){
        return idCarrera;
    }

    //Setter
    public void setDni(long paramDni){
        this.dni=paramDni;
    }

    public void setCarrera(Carrera paramCarrera){
        this.idCarrera=paramCarrera;
    }
}
