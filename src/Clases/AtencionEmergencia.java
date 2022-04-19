
package Clases;

public class AtencionEmergencia {
    private String paciente;
    private int nivel; //1:Muy Grave , 2: Grave , 3: Leve
    private String causa;
    
    public AtencionEmergencia () {
        paciente = "";
        nivel = 0;
        causa = "";
    }
    public AtencionEmergencia (String p, int n, String c) {
        paciente = p;
        nivel = n;
        causa = c;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
}
