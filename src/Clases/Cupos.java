package Clases;

import java.io.Serializable;

public class Cupos implements Serializable {
    String especialidad; 
    String area;
    int cantidad ;
    
    public Cupos () {
        especialidad = "";
        area = "";
        cantidad = 0;
    }    
}
