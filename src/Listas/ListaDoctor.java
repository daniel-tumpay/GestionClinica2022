package Listas;

import Clases.Doctor;
import Clases.MatrizCupos;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class ListaDoctor implements Serializable {
    
    public class NodoDoctor implements Serializable {
        Doctor D;
        NodoDoctor siguiente = null;
        NodoDoctor (Doctor doc){
            D = doc;
        }
    }
   
    NodoDoctor P = null;
    int longitud = 0;
    MatrizCupos plazas = new MatrizCupos ();
    int odontología = 1, nutricion = 1, psicologia = 1;
    int emergencias [] = new int [15];
    
    public void InsertarDoctor_Final (Doctor d){        
        NodoDoctor Q = new NodoDoctor (d);
        if( P == null ){            
            P = Q;
        }else {
            NodoDoctor T = P;
            while (T.siguiente != null) {
                T = T.siguiente;
            }
            T.siguiente = Q;
        }
        longitud++;        
    }    

    public boolean ComprobarCDGduplicado (String codigo){
        boolean result=false;
        NodoDoctor Q = P;
        while (Q!= null){
            if(Q.D.getCodigo().equals(codigo)){
                result = true;
            }
            Q = Q.siguiente;
        }
        return result;
    }
       
    public boolean HayCupo (String espc, String area) {
        boolean result = false;
        result = plazas.HayCupoEnMatriz(espc, area);
        if(area == "Consulta") {
            if(espc == "Odontología" && odontología != 0) {
                result = true;
            }
            if(espc == "Nutrición" && nutricion != 0) {
                result = true;
            }
            if(espc == "Psicología" && psicologia != 0) {
                result = true;
            }
        }
        if(espc == "Emergencia"){
            
        }
        return result;
    }
    
    public void DisminuirVacantes (String espc, String area) {  
        plazas.RegistrarCupo(espc, area);
        if(area == "Consulta") {
            if(espc == "Odontología") {
                odontología--;
            }
            if(espc == "Nutrición") {
                nutricion--;
            }
            if(espc == "Psicología") {
                psicologia--;
            }
        }
        if(espc == "Emergencia"){
            
        }
    }   
    
    public void ImprimirVacantes () {
        System.out.println("CUPOS");
        plazas.ImprimirMatriz();
        System.out.println("Odontologia" + odontología);
        System.out.println("Nutrición" + nutricion);
        System.out.println("Psicología" + psicologia);
    }
    
    public void ObtenerCodigoDoctor (Doctor d) {
        NodoDoctor Q = P;
        while(Q != null){
            if(Q.D.getEspecialidad().equals(d.getEspecialidad())){
                d.setCodigo(Q.D.getCodigo());
            }
            Q = Q.siguiente;
        }
    }
    
    public String DameDoctorHospitalizacion (String especialidad) {
        String doc = "";
        NodoDoctor Q = P;
        while(Q != null){
            if(Q.D.getEspecialidad().equals(especialidad)){
                doc = Q.D.getNombre() + " " + Q.D.getApellido();
            }
            Q = Q.siguiente;
        }
        return doc;
    }
    
    
    
    
}
