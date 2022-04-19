
package Listas;

import Clases.AtencionEmergencia;


public class Cola {
    
    public class NodoAtencion {
        AtencionEmergencia valor;
        NodoAtencion siguiente = null;        
        public NodoAtencion (AtencionEmergencia v) {
            valor = v;
        }        
    }    
    
    NodoAtencion frente = null; NodoAtencion finaal = null; 
    
    public void Encolar (AtencionEmergencia x){
        NodoAtencion Q = new NodoAtencion (x);
        if(frente == null){
            frente = Q; finaal = Q;
        }else{
            NodoAtencion R = frente;
            while (R.siguiente != null && x.getNivel() >= R.siguiente.valor.getNivel()){
                //se insertara despues del nodo R
                //System.out.print("["+Q.valor+"]");
                R = R.siguiente;
            }
            //Ahora lo inserto despues de R
            if(R.siguiente != null){ //Si no es el ultimo
                if(R == frente && R.valor.getNivel() > x.getNivel()) {
                    Q.siguiente = R;
                    frente = Q;
                }else{
                    Q.siguiente = R.siguiente;
                    R.siguiente = Q;
                }
            }else{
                if(R == finaal && R.valor.getNivel() > x.getNivel()) {
                    Q.siguiente = R;
                    frente = Q;
                }else{
                    finaal.siguiente = Q;
                    Q.siguiente = null;
                    finaal = Q;
                } 
                finaal.siguiente = Q;
                Q.siguiente = null;
                finaal = Q;
            }
        }
    }

    public void EliminarInicio () {
        if(frente == finaal){
            frente = null; finaal = null;
        }else{
            NodoAtencion T = frente.siguiente;
            frente = T;
        }
    }    
    
    public AtencionEmergencia primero () {
        AtencionEmergencia primi = new AtencionEmergencia ();
        primi = frente.valor;
        return primi;
    }
    
    public String Cola () {
        String texto = "------------------------------------------------------------------------------------------\n"+
                       "----------------------------------SERVIDORES------------------------------------\n" +
                       "------------------------------------------------------------------------------------------\n\n";                        
        NodoAtencion Q = frente;        
        while (Q!= null){
            texto += ("\t                    " + Q.valor.getPaciente() + "["+Q.valor.getNivel()+"]\n");
            Q = Q.siguiente;
        }
        return texto;
    }
    
    public String DatosPrimero () {
        String texto = "                DATOS DEL PRIMERO EN LA COLA \n";
                texto += ("\nNOMBRE: " + frente.valor.getPaciente()
                        + "\nNIVEL DE URGENCIA: NIVEL - " + frente.valor.getNivel()
                        + "\nCAUSA: " + frente.valor.getCausa());        
        System.out.println("Ultimo: "+finaal.valor.getPaciente());
        return texto;
    }
}
