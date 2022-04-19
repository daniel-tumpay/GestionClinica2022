package Arboles;

public class A_Participacion {
    private String nombre;
    private int puntaje;
    private int clave;
    
    public A_Participacion (String n, int p, int c) {
        nombre = n;
        puntaje = p;
        clave = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }   

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public int compararClaves (A_Participacion pa) {
       if(clave == pa.clave){
           return 0;
       }else if(clave < pa.clave){
           return -1;
       }else{
           return 1;
       }
   }
   
    public int compararPuntajes (A_Participacion pa) {
       if(puntaje == pa.puntaje){
           return 0;
       }else if(puntaje < pa.puntaje){
           return -1;
       }else{
           return 1;
       }
   }
}
