package Listas;

import Clases.Servicio;
import java.io.Serializable;

public class ListaServicios implements Serializable {
    
    public class NodoServicio implements Serializable {
        Servicio servicio;
        NodoServicio siguiente = null;
        NodoServicio (Servicio s){
            servicio = s;
        }
    }
    
    NodoServicio P = null;
    int longitud = 0;
    
    public void GuardarServicioEnLista (Servicio s){        
        NodoServicio Q = new NodoServicio (s);
        if( P == null ){            
            P = Q;
        }else {
            NodoServicio T = P;
            while (T.siguiente != null) {
                T = T.siguiente;
            }
            T.siguiente = Q;
        }
        longitud++;
    }
    
    public String DarTextoDeServicios () {
        String texto = "";
        int aux = 1;
        NodoServicio Q = P;
        while (Q!= null){
            String b = "";
            if(Q.servicio.getTipo().equals("Consulta")){
                b =  "\n\tTURNO: " + Q.servicio.getTurno() +
                    "\n\tFECHA: " + Q.servicio.getFecha().EscribirFecha();
            }            
            String a =  "Servicio # " + (aux) + 
                        "\n\tTIPO: " + Q.servicio.getTipo() +
                        "\n\tESPECIALIDAD: " + Q.servicio.getEspecialidad() + 
                        "\n\tDOCTOR: " + Q.servicio.getDoc() + b + 
                        "\n===================================================\n";
            if(Q.servicio.getTipo().equals("Emergencia")){
                a = "Servicio # " + (aux) + 
                    "\n\tTIPO: " + Q.servicio.getTipo() +
                    "\n\tNIVEL: " + Q.servicio.getNivel() + 
                    "\n\tCAUSA: " + Q.servicio.getCausa() + 
                    "\n===================================================\n";
            }
            texto += a;
            aux ++;
            Q = Q.siguiente;
        }
        return texto;
    }
    
    public void CambiarDoctor (String nDocAnt, String nDocNue){
        NodoServicio Q = P;
        while (Q!= null){  
            if(Q.servicio.getTipo().equals("Consulta")){
                if(Q.servicio.getDoc().contains(nDocAnt)){
                    Q.servicio.setDoc(nDocNue);
                }
            }
            Q = Q.siguiente;
        }
    }
}
