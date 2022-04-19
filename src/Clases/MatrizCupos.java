
package Clases;

import java.io.Serializable;

public class MatrizCupos implements Serializable{
    Cupos vacantes [][] = new Cupos [2][9];
    int odontología = 0, nutricion = 0, psicologia = 0;
    int emergencias [] = new int [15];
    
    public MatrizCupos () {
        String especialidades [] = {"Medicina General","Cardiología", "Dermatología",
                    "Hematología" , "Traumatología",  "Geriatría" , "Neumología" ,
                    "Nefrología" , "Reumatología"};
        for(int i=0; i<2; i++) {
            for(int j=0; j<9; j++) {
                vacantes [i][j] = new Cupos ();
                vacantes [i][j].especialidad = especialidades [j]; 
            }
        }
        for(int j=0; j<9; j++) {
            vacantes [0][j].area = "Consulta";
            vacantes [0][j].cantidad = 3;
            vacantes [1][j].area = "Hospitalizacion";
            vacantes [1][j].cantidad = 1;
        }                                
    }
    
    public boolean HayCupoEnMatriz (String espc, String tipo) {
        boolean result = false;
        for(int i=0; i<2; i++) {
            for(int j=0; j<9; j++) {
                if((vacantes [i][j].especialidad.equals(espc)) && 
                        (vacantes [i][j].area.equals(tipo))){
                    if(vacantes [i][j].cantidad > 0){
                        result = true;
                    }
                }                
            }
        }
        return result;
    }
    
    public void RegistrarCupo (String espc, String tipo) {
        for(int i=0; i<2; i++) {
            for(int j=0; j<9; j++) {
                if((vacantes [i][j].especialidad.equals(espc)) && 
                        (vacantes [i][j].area.equals(tipo))){
                    vacantes [i][j].cantidad --;
                }                
            }
        }
    }   
    
    public void ImprimirMatriz () {        
        System.out.println("Hospitalizacion");
        for(int j=0; j<9; j++) {
            System.out.print("["+ vacantes [1][j].cantidad + "] ");
        }
        System.out.println("");
        System.out.println("Consulta");
        for(int j=0; j<9; j++) {
            System.out.print("["+ vacantes [0][j].cantidad + "] ");
        }
       
    }
}
