package Arboles;

import Listas.ArbolBinario;

public class A_Torneo {
    private String participantes [];
    public int registrados;
    public int cupos;
    public ArbolBinario cuadro;
    
    public A_Torneo () {
        participantes = new String [16];
        registrados = 0;
        cupos = 16;
        cuadro = new ArbolBinario ();
    }

    public String[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String[] participantes) {
        this.participantes = participantes;
    }
    
    
    public void InicializarArbol (String [] participantes) {
       
       int arregloclaves [] = {16,8,24,4,12,20,28,2,6,10,14,18,22,26,30,1,3,5,7,
           9,11,13,15,17,19,21,23,25,27,29,31};
       
       String nombre = "";
       int puntaje = 0;
       A_Participacion aux [] = new A_Participacion [15];
       for(int i = 0; i< 15; i++){
           aux [i] = new A_Participacion (nombre, puntaje,arregloclaves [i]);
           cuadro.insertar(aux[i]);
       }
       //Insetando la gente de octavos
       A_Participacion aux2 [] = new A_Participacion [16];     
       for(int i = 0; i< 16; i++){
           aux2 [i] = new A_Participacion (participantes[i], puntaje, arregloclaves [i+15]);
           cuadro.insertar(aux2[i]);
       }       
   }
    
    public void DARPuntaje (int clave, int puntaje) {
       cuadro.DarPuntaje(clave, puntaje);
   }
        
    public void LlenarPadre (int clave) {
       if(cuadro.participante != null){
           if(clave == cuadro.participante.getClave()){               
               if(cuadro.izquierdo.participante.getPuntaje() > cuadro.derecho.participante.getPuntaje()){
                   cuadro.participante.setNombre(cuadro.izquierdo.participante.getNombre());
               }else{
                   cuadro.participante.setNombre(cuadro.derecho.participante.getNombre());
               }               
           }else if (clave < cuadro.participante.getClave() && cuadro.izquierdo != null) {
               cuadro.izquierdo.LlenarPadre(clave);
           }else if (clave > cuadro.participante.getClave() && cuadro.derecho != null) {
               cuadro.derecho.LlenarPadre(clave);
           }else{
               System.out.println("No hay esa clave");
           }
       }else{
           System.out.println("Es nulo");
       }
   }
}
