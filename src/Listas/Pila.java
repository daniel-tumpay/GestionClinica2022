
package Listas;
import Clases.AtencionEmergencia;
import javax.swing.JOptionPane;

public class Pila {
    
    public class Nodo {
        
    AtencionEmergencia informacion;
    Nodo siguiente;
    
    public Nodo(AtencionEmergencia valor){
        informacion = valor;
        siguiente = null;
    }
}
    private Nodo cima;
    int tamano = 0;
    
    public Pila(){
        cima = null;
        tamano = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return cima == null;
    }
    
    //Método para insertar un nodo en la pila
    public void InsertarNodo(AtencionEmergencia a){
        Nodo nuevo_nocdo = new Nodo(a);
        if(cima == null){
            cima = nuevo_nocdo;
        }else{
            nuevo_nocdo.siguiente = cima;
            cima = nuevo_nocdo;
        }
        tamano++;
    }
        
    //Método para eliminar un nodo de la pila
    public AtencionEmergencia EliminarNodo(){
        AtencionEmergencia auxiliar = cima.informacion;
        cima = cima.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //Método para conocer cual es el último valor ingresado
    public AtencionEmergencia MostrarUltimoValorIngresado(){
        return cima.informacion;
    }
    
    //Método para conocer el tamaño de la Pila
    public int TamanoPila(){
        return tamano;
    }
    
    //Método para vaciar la Pila
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();            
        }
    }
    
    //Método para mostrar el contenido de la pila
    public String Pila(){
        String texto = "------------------------------------------------------------------------------------------\n"+                       
                       "---------------------- HISTORIAL DE ATENCIONES --------------------------\n" +                        
                       "------------------------------------------------------------------------------------------\n\n";
        Nodo recorrido = cima;
        
        while(recorrido != null){
            texto += ("\t                    "+ recorrido.informacion.getPaciente() 
                    + "["+recorrido.informacion.getNivel() +"]\n");
            recorrido = recorrido.siguiente;
        }
        return texto;
    }
}
