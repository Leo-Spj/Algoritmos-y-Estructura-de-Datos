package org.example.personas;

public class LinkedList {

    private Persona head;

    public void comparaMayor_o_Menor(String nuevoNombre) {
        Persona persona = new Persona(nuevoNombre);

        if (head == null || nuevoNombre.compareToIgnoreCase(head.getNombre()) < 0) {
            persona.setSiguientePersona(head);
            head = persona;
            return;
        }

        Persona auxPersona = head;
        Persona anteriorPersona = null;

        while (auxPersona != null && nuevoNombre.compareToIgnoreCase(auxPersona.getNombre()) > 0) {
            anteriorPersona = auxPersona;
            auxPersona = auxPersona.getSiguientePersona();
        }

        if (anteriorPersona != null) {
            anteriorPersona.setSiguientePersona(persona);
        } else {
            head = persona;
        }

        persona.setSiguientePersona(auxPersona);
    }

    public String imprimir(){
        Persona temp = head;
        String cadena = "";

        while(temp != null){
            cadena  += temp.getNombre() + " ";
            temp = temp.getSiguientePersona();
        }

        return cadena;
    }
}
