package Entidades;

import javax.persistence.Entity;

@Entity
public class Pregunta {
    private long id;
    private String textoPregunta;
    private Encuesta idEncuesta;

    //CONSTRUCTOR, GETTER Y SETTER
    //constructor por default

    public Pregunta(){

    }

    //Getter
    public Long getId(){
        return id;
    };

    public String getTextoPregunta(){
        return textoPregunta;
    }

    public Encuesta getEncuesta(){
        return idEncuesta;
    }

    //Setter

    public void setId(long paramId){
        this.id=paramId;
    }
    public void setTextoPregunta(String paramTexto){
        this.textoPregunta=paramTexto;
    }

    public void setIdEncuesta(long idEncuesta){
        this.idEncuesta.setId(idEncuesta);
    }
}
