package org.example.personas;

public class Persona {

    private String nombre;
    private Persona siguientePersona;

    Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getSiguientePersona() {
        return siguientePersona;
    }

    public void setSiguientePersona(Persona siguientePersona) {
        this.siguientePersona = siguientePersona;
    }
}
