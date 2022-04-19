
package Clases;

import java.io.Serializable;

public class Cama implements Serializable {
   
   private int numero; //301,...,615
   private int piso; //3,4,5,6
   private String seccion; 
   //Medicina General,Cardiologia,Dermatología,Hematologia
   //Traumatolgia,Geriatria,Neumologia,Nefrologia,Reumatología,Quirofano, Sala de Parto
   private boolean uso;
   private int urgencia;
   Paciente paciente;
   
   public Cama () {
        uso = false;
        paciente = new Paciente ();
        urgencia = 0;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public boolean isUso() {
        return uso;
    }
    public void setUso(boolean uso) {
        this.uso = uso;
    }  
    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }
    
}