package Listas;

import Arboles.A_Participacion;

public class ArbolBinario {
    public A_Participacion participante;   
    public ArbolBinario izquierdo, derecho;
    public ArbolBinario padre;
    
   public void InicializarArbol (String [] participantes) {       
       int arregloclaves [] = {16,8,24,4,12,20,28,2,6,10,14,18,22,26,30,1,3,5,7,
           9,11,13,15,17,19,21,23,25,27,29,31};
       //Inicialmente todos los valores despues de octavos son vacios
       String nombre = "";
       int puntaje = 0;
       A_Participacion aux [] = new A_Participacion [15];
       for(int i = 0; i< 15; i++){
           aux [i] = new A_Participacion (nombre, puntaje,arregloclaves [i]);
           this.insertar(aux[i]);
       }      
       A_Participacion aux2 [] = new A_Participacion [16];     
       for(int i = 0; i< 16; i++){
           aux2 [i] = new A_Participacion (participantes[i], puntaje, arregloclaves [i+15]);
           this.insertar(aux2[i]);
       }
   }
   
   public void insertar (A_Participacion p){
       insertarImpl (p,null);
   }
   
   public void insertarImpl (A_Participacion p, ArbolBinario padre) {
       if(participante == null) {
           participante = p;
           this.padre = padre;
       }else{
           if(p.compararClaves(participante)<0){
               if(izquierdo == null){
                   izquierdo = new ArbolBinario () ;                   
               }      
               izquierdo.insertarImpl(p, this);
           }else if (p.compararClaves(participante) > 0) {
               if(derecho == null){
                   derecho = new ArbolBinario () ;
               }
               derecho.insertarImpl(p, this);
           }else{
           }
       }
   }   
   
   public void LlenarPadre (int clave) {
       if(participante != null){
           if(clave == participante.getClave()){               
               if(izquierdo.participante.getPuntaje() > derecho.participante.getPuntaje()){
                   participante.setNombre(izquierdo.participante.getNombre());
               }else{
                   participante.setNombre(derecho.participante.getNombre());
               }               
           }else if (clave < participante.getClave() && izquierdo != null) {
               izquierdo.LlenarPadre(clave);
           }else if (clave > participante.getClave() && derecho != null) {
               derecho.LlenarPadre(clave);
           }else{
               System.out.println("No hay esa clave");
           }
       }else{
           System.out.println("Es nulo");
       }
   }
   
   public void DarPuntaje (int clave, int puntaje) {
       if(participante != null){
           if(clave == participante.getClave()){                              
               participante.setPuntaje(puntaje);                             
           }else if (clave < participante.getClave() && izquierdo != null) {
               izquierdo.DarPuntaje(clave, puntaje);
           }else if (clave > participante.getClave() && derecho != null) {
               derecho.DarPuntaje(clave, puntaje);
           }else{
               System.out.println("No hay esa clave");
           }
       }else{
           System.out.println("Es nulo");
       }
   }
   
   public boolean existe (int id){
       //Compureba si hay un elemento que pide
       if(participante != null){
           if(id == participante.getPuntaje()){
               return true;
           }else if (id < participante.getPuntaje() && izquierdo != null) {
               return izquierdo.existe(id);
           }else if (id > participante.getPuntaje() && derecho != null) {
               return derecho.existe(id);
           }else{
               return false;
           }
       }else{
           return false;
       }
   }
   
   public A_Participacion obtener (int clave){
       if(participante != null){
           if(clave == participante.getClave()){
               return participante;
           }else if (clave < participante.getClave() && izquierdo != null) {
               return izquierdo.obtener(clave);
           }else if (clave > participante.getClave() && derecho != null) {
               return derecho.obtener(clave);
           }else{
               return null;
           }
       }else{
           return null;
       }
   }     
   String cadenapreorden = "", cadenainorden = "", cadenapostorden = "";
   String aux;
   
    public String preorden () {
       if(participante != null){
           cadenapreorden += participante.getNombre() + "(" + participante.getClave() +")\n";
           if(izquierdo != null) cadenapreorden +=  izquierdo.preorden();           
           if(derecho != null)  cadenapreorden +=  derecho.preorden();
        } 
       aux = cadenapreorden;
       cadenapreorden = "";
       return aux; 
    }
    
    public String inorden () {        
       if(participante != null){
           if(izquierdo != null) cadenainorden += izquierdo.inorden();
           cadenainorden += participante.getNombre() + "(" + participante.getClave() +")\n";
           if(derecho != null)  cadenainorden += derecho.inorden();               
        }  
       aux = cadenainorden;
       cadenainorden = "";
       return aux;        
    }
   
    public String postorden () {
       if(participante != null){
           if(izquierdo != null) cadenapostorden +=  izquierdo.postorden();
           if(derecho != null) cadenapostorden +=  derecho.postorden();
           cadenapostorden += participante.getNombre() + "(" + participante.getClave() +")\n";
        }
       aux = cadenapostorden;
       cadenapostorden = "";
       return aux; 
    }
}
