package Clases;

import java.io.Serializable;

public class Servicio implements Serializable {
    private String tipo; //Cita, Hospitalizacion y Emergencia
    private String especialidad;
    private String doc;
    //Si es que es cita
    private String turno;
    private Fecha fecha;
    //Si es de emergencia
    private String nivel;
    private String causa;
    
    public Servicio () {
        tipo = "";
        especialidad = "";
        doc = "";
        turno = "";
        fecha = new Fecha (1,11,2020);
        nivel = "";
        causa = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    //Emergencias
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
}
