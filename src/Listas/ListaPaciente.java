package Listas;

import Clases.Paciente;
import Clases.Servicio;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class ListaPaciente implements Serializable {
    
    public class NodoPaciente implements Serializable {
        Paciente Pac;
        NodoPaciente siguiente = null;
        NodoPaciente (Paciente pac){
            Pac = pac;
        }
    }
    
    NodoPaciente P = null;
    int longitud = 0;
    private static String FILE_NAME = "Guia Telefonica.txt";
    
    public void InsertarPaciente (Paciente p){
        //Inserta por el final de la lista
        NodoPaciente Q = new NodoPaciente (p);
        if( P == null ){
            P = Q;
        }else {            
            NodoPaciente T = P;
            while (T.siguiente != null) {
                T = T.siguiente;
            }
            T.siguiente = Q;
        }
        longitud++;
    }
    
    public void hospitalizar(String codigo, Paciente p) {
        NodoPaciente Q = P;
        NodoPaciente T = null;
        while (Q!= null){
            if(Q.Pac.getDNI().equals(codigo)){
                T = Q;
            }
            Q = Q.siguiente;
        }
        if(T == null){
            JOptionPane.showMessageDialog(null, "No hay paciente en el sistema con ese codigo");
        }else{            
            T.Pac.setHospitalizado(true);
            p.setNombre(T.Pac.getNombre());
            p.setApellido(T.Pac.getApellido());
            p.setDNI(T.Pac.getDNI());                       
        }                 
    }    
    
    public void darAlta (String codigo) {
        NodoPaciente Q = P;
        while (Q!= null){
            if(Q.Pac.getDNI().equals(codigo)){
                Q.Pac.setHospitalizado(false);
            }
            Q = Q.siguiente;
        }
    }
    
    
    public void ObtenerGuia () throws IOException {
        int i= 1;
        FileWriter output = new FileWriter (FILE_NAME);
        NodoPaciente Q = P;
        while (Q!= null){
            output.write(i + ") ");
            output.write(Q.Pac.getApellido()+ "\t");
            output.write(Q.Pac.getNombre()+ "\t\t");
            output.write(" --> ");
            output.write(Q.Pac.getTelefono()+ "\r\n");
            i++;
            Q = Q.siguiente;
        }
        output.close();
    }
    
    public void registrarServ (String dni, Servicio s){
        NodoPaciente Q = P;
        while (Q!= null){
            if(Q.Pac.getDNI().equals(dni)){
                Q.Pac.historial.GuardarServicioEnLista(s);
                Q.Pac.setNumServicios(Q.Pac.getNumServicios() + 1);
            }
            Q = Q.siguiente;
        }
    }
    
    void modificarDoctorServicio(String dni, String nDocAnt, String nDocNue) {
        NodoPaciente Q = P;
        while (Q!= null){
            if(Q.Pac.getDNI().equals(dni)){
                Q.Pac.historial.CambiarDoctor(nDocAnt, nDocNue);                
            }
            Q = Q.siguiente;
        }
    }
    
    public boolean Comprobar (String dni){
        boolean result=false;
        NodoPaciente Q = P;
        while (Q!= null){
            if(Q.Pac.getDNI().equals(dni)){
                result = true;
            }
            Q = Q.siguiente;
        }
        return result;
    }
    
    public boolean hospitalizado (String codigo) {
        boolean result=false;
        NodoPaciente Q = P;
        while (Q!= null){
            if(Q.Pac.getDNI().equals(codigo)){
                if(Q.Pac.isHospitalizado()){
                    result = true;
                }
            }
            Q = Q.siguiente;
        }
        return result;
    }            
}