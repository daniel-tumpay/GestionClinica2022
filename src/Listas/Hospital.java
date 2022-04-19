
package Listas;

import Arboles.A_Torneo;
import Clases.Doctor;
import Clases.MatrizCama;
import Clases.Paciente;
import Clases.Servicio;
import Listas.ListaServicios.NodoServicio;
import java.io.IOException;

public class Hospital {
    
    ListaDoctor doctores = new ListaDoctor ();
    ListaDoctorDeCitas doccitas = new ListaDoctorDeCitas();
    ListaPaciente pacientes = new ListaPaciente ();
    public MatrizCama habitaciones = new MatrizCama ();    
    public A_Torneo torneito = new A_Torneo ();

    //PARA DOCTORES GENERALES
    public ListaDoctor getDoctores() {
        return doctores;
    }
    public void setDoctores(ListaDoctor doctores) {
        this.doctores = doctores;
    }
    
    //PARA DOCTORES DE CITAS
    public ListaDoctorDeCitas getDoccitas() {
        return doccitas;
    }
    public void setDoccitas(ListaDoctorDeCitas doccitas) {
        this.doccitas = doccitas;
    }

    //PARA PACIENTES
    public ListaPaciente getPacientes() {
        return pacientes;
    }
    public void setPacientes(ListaPaciente pacientes) {
        this.pacientes = pacientes;
    }

    //PARA HABITACIONES
    public MatrizCama getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(MatrizCama habitaciones) {
        this.habitaciones = habitaciones;
    }
   
    public boolean ingresarDoctor (Doctor doc){     
        boolean result=false;
        if(!BuscarDoctor(doc.getCodigo())){                
                Agregar(doc);
                result= true;
        }
        return result;
    }
    
    public boolean BuscarDoctor (String codigo) {
        boolean result=false;
        result = this.doctores.ComprobarCDGduplicado(codigo);
        return result;
    }
    
    public void Agregar(Doctor d){
        this.doctores.InsertarDoctor_Final(d);
    }
    
    public boolean ingresarDoctorCitas (Doctor doc){             
        boolean result=true;
        AgregarDoctorCitas (doc);
        return result;
    }
    
    public void AgregarDoctorCitas (Doctor d){
        this.doccitas.InsertarDoctorCitas_Final(d);
    }
    
    public boolean ingresarPaciente (Paciente pa) {
        boolean result=false;
        if(!BuscarPaciente(pa.getDNI())){
                AgregarPaciente (pa);           
                result= true;
        }
        return result;
    }
    
    public boolean BuscarPaciente (String dni) {
        boolean result=false;
        result = this.pacientes.Comprobar(dni);
        return result;
    }
    
    public void AgregarPaciente (Paciente pa) {
        this.pacientes.InsertarPaciente(pa);
    }
            
    public boolean ingresarPacienteLL (Doctor d, Paciente pa) {
        boolean result = true;
        AgregarPacienteLL (d, pa) ;
        return result;
    }
    
    public void AgregarPacienteLL (Doctor d, Paciente pa) {
        this.doccitas.InsertarPaciente(d, pa);
    }

    public void pormientras () {
        this.doccitas.recorrerListadeListas();
    }    
    
    public boolean MoverPacienteLL (String codigoDoctAnte, String dni, String codigoDocNuevo){
        boolean result = true;
        this.doccitas.CambiarDeDoctor(codigoDoctAnte, dni, codigoDocNuevo);
        return result;
    }
    
    public void CambiarDoctorServicio(String dni, String nDocAnt, String nDocNue){
        this.pacientes.modificarDoctorServicio (dni,nDocAnt,nDocNue);
    }

    public String[][] DataDoctores (){
        int x = this.doctores.longitud;
        String [][] result = new String[this.doctores.longitud][5];
        int i=0;
        ListaDoctor.NodoDoctor Q = this.doctores.P;
        while(Q != null){
            result[i][0] = Q.D.getCodigo();
            result[i][1] = Q.D.getNombre();
            result[i][2] = Q.D.getApellido();
            result[i][3] = Q.D.getArea();
            result[i][4] = Q.D.getEspecialidad();
            Q = Q.siguiente;
            i++;
        }
        return result;
    }
    
    public String[] getTitulos (){
        String result[] = new String[5];
        
        result[0] = "CODIGO";
        result[1] = "NOMBRE";
        result[2] = "APELLIDO";
        result[3] = "AREA";
        result[4] = "ESPECIALIDAD";
        
        return result;
    }

    public boolean HospitalizarP (String codigo, String numca) {
        boolean valor = true;
        Paciente p = new Paciente ();
        this.pacientes.hospitalizar(codigo, p);
        this.habitaciones.AsignandoPaciente(p, numca);
        return valor;
    }
    
    public boolean EstaHospitalizado (String codigo) {
        boolean valor = true;
        valor = this.pacientes.hospitalizado(codigo);
        return valor;
    }
    
    public String obtenerCamaPacienteH (String codigo) {
        String numero = "101";
        numero = this.habitaciones.ObtenerNumeroCama(codigo);
        return numero;
    }
    
    public boolean DarAlta (String dni, String numca) {
        boolean valor = true;
        Paciente p = new Paciente ();
        this.pacientes.darAlta(dni);
        this.habitaciones.DesasignarPaciente(numca);
        return valor;
    }
    
    public void RegistrarServicio (String dni, String tipo, String especialidad) {
        Servicio serv = new Servicio () ;
        serv.setTipo(tipo);
        serv.setEspecialidad(especialidad);
        String doct = this.doctores.DameDoctorHospitalizacion(especialidad);
        serv.setDoc(doct);
        this.pacientes.registrarServ (dni, serv);
    }
    
    public void RegistrarServicio2 (String dni, Servicio serv) {        
        this.pacientes.registrarServ (dni, serv);
    }
    
    public String[] CopiarDatosPaciente (String codigo){        
        ListaPaciente.NodoPaciente Q = this.pacientes.P;       
        String result[] = new String[3];
        while (Q != null){            
            if(Q.Pac.getDNI().equals(codigo)){
                result[0] = Q.Pac.getNombre();
                result[1] = Q.Pac.getApellido();
                result[2] = Q.Pac.getSexo();
            }
            Q = Q.siguiente;                                    
        }
        return result;
    }
        
    public String [] ConsultasGenerales () {
        String result[] = new String[10];
        int a = 0, b = 0, c =0; 
        int psh=0, psm=0, ph=0, phh=0, phm =0;
        //Doctores
        result [0] = String.valueOf(this.doctores.longitud);
        ListaDoctor.NodoDoctor Q = this.doctores.P;
        while(Q != null){   
            if(Q.D.getArea().equals("Consulta")){
                a ++;
            }
            if(Q.D.getArea().equals("Hospitalizacion")){
                b ++;
            }
            if(Q.D.getArea().equals("Emergencia")){
                c ++;
            }
            Q = Q.siguiente;
        }  
        result [2] = String.valueOf(a); 
        result [1] = String.valueOf(b); 
        result [3] = String.valueOf(c); 
        ListaPaciente.NodoPaciente T = this.pacientes.P;
         while(T != null){   
            if(T.Pac.getSexo().equals("Masculino")){
                psh ++;
                if(T.Pac.isHospitalizado()){
                    ph ++;
                    phh ++;
                }
            }
            if(T.Pac.getSexo().equals("Femenino")){
                psm ++;
                if(T.Pac.isHospitalizado()){
                    ph ++;
                    phm ++;
                }
            }            
            T = T.siguiente;
        }  
        result [4] = String.valueOf(this.pacientes.longitud); 
        result [5] = String.valueOf(psh); 
        result [6] = String.valueOf(psm); 
        result [7] = String.valueOf(ph); 
        result [8] = String.valueOf(phh); 
        result [9] = String.valueOf(phm);                 
        return result;
    }
    
    public String [] CamasxEsp (String esp) {
        String r [] = this.habitaciones.ObtenerNumeros(esp);
        return r;        
    }
    
    public String [] CamasxEsp2 (String esp) {
        String r [] = this.habitaciones.ObtenerNumeros2(esp);
        return r;        
    }

    public String [][] DatosCamas (String especialidad) {
        String [][] result = new String[5][5];
        result = this.habitaciones.DatosCamaxEspecialidad(especialidad);                
        return result;      
    }

    public void Llenar_guia () throws IOException {
        this.pacientes.ObtenerGuia();
    }
    
    
    public String [] Opciones (String esp) { 
        int l = 0, indice = 1;
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while(Q != null){
            if(Q.D.getEspecialidad().equals(esp)){
                l ++; 
            }
            Q = Q.siguiente;
        }        
        String r [] = new String [l+1];
        r[0] = "Sin Seleccionar";
        ListaDoctorDeCitas.NodoDoctor T = this.doccitas.P;
        while(T != null){           
            if(T.D.getEspecialidad().equals(esp)){                
                String aux = T.D.getCodigo() + " - " + T.D.getApellido() + " " + T.D.getNombre();
                r[indice] =  aux;
                indice ++;
            }
            T = T.siguiente;
        }
        return r;
    }

    public String [] Opciones2 (String esp, String codigo) { 
        int l = 0, indice = 1;
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while(Q != null){
            if(Q.D.getEspecialidad().equals(esp)){
                l ++; 
            }
            Q = Q.siguiente;
        }        
        String r [] = new String [l]; 
        r[0] = "Sin Seleccionar";
        ListaDoctorDeCitas.NodoDoctor T = this.doccitas.P;
        while(T != null){           
            if(T.D.getEspecialidad().equals(esp)){
                if(T.D.getCodigo().equals(codigo)){
                    //aqui esta el doctor con el mismo codigo                  
                }else{
                    String aux = T.D.getCodigo() + " - " + T.D.getApellido() + " " + T.D.getNombre();
                    r[indice] =  aux;
                    indice ++;
                }                
            }
            T = T.siguiente;
        }
        return r;
    }

    public String [] PacientesDeConsultas (String codi) {       
        int l = 0, indice = 1;   
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        ListaDoctorDeCitas.NodoDoctor T = null;
        while(Q != null){           
            if(Q.D.getCodigo().equals(codi)){
                T = Q;
                l = Q.D.getNumpacientes();
            }
            Q = Q.siguiente;
        }
        String r [] = new String [l+1];
        r[0] = "Sin Seleccionar";
        
        ListaDoctorDeCitas.NodoPaciente S = T.cabpaciente;
        
        while (S != null){
            String aux = S.p.getDNI() + " - " + S.p.getApellido();
            r[indice] =  aux;
            indice ++;
            S = S.siguiente;
        }
        return r;
    }
    
    public String[] ObtenerDatosPaciente (String codigo){
        
        String result[] = new String[5];
        String aux = "";
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            ListaDoctorDeCitas.NodoPaciente T = Q.cabpaciente;         
            while (T != null){
                if(T.p.getDNI().equals(codigo)){    
                    aux = Q.D.getNombre() + " " + Q.D.getApellido();
                    result[0] = T.p.getNombre();
                    result[1] = T.p.getApellido();
                    result[2] = T.p.getSexo();
                    result[3] = Q.D.getEspecialidad();
                    result[4] = aux;
                }
                T = T.siguiente;
            }
            Q = Q.siguiente;
        }
        return result;
    }
    
    public String[] ObtenerNombreApellidoDoctorCitas (String codigo){
        String result[] = new String[3];
        String aux = "";
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            if(Q.D.getCodigo().equals(codigo)){ 
                result[0] = Q.D.getNombre();
                result[1] = Q.D.getApellido();
                result[2] = Q.D.getEspecialidad();
            }            
            Q = Q.siguiente;
        }
        return result;
    }
    
    public String[] ObtenerDatosPacienteParaHistorial (String codigo){
        String result[] = new String[4];
        String aux = "";
        ListaPaciente.NodoPaciente Q = this.pacientes.P;
        while (Q != null){
            if(Q.Pac.getDNI().equals(codigo)){ 
                result[0] = Q.Pac.getNombre();
                result[1] = Q.Pac.getApellido();
                result[2] = Q.Pac.getSexo();
                if(Q.Pac.isHospitalizado()){
                    result[3] = "Hospitalizado";
                }else{
                    result[3] = "No Hospitalizado";
                }
            }            
            Q = Q.siguiente;
        }
        return result;
    }

    public void BuscarD (Doctor d){
        this.doccitas.ObtenerCodigoDoctor(d);
    }
    
    public String CitasxDoctor (String codigo) {
        String texto = "";
        int aux = 1;
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            if(Q.D.getCodigo().equals(codigo)){
                ListaDoctorDeCitas.NodoPaciente T = Q.cabpaciente;            
                while (T != null){
                    String a =  "CITA # " + (aux) + 
                                "\n\tNOMBRE: " + T.p.getNombre() +
                                "\n\tAPELLIDO: " + T.p.getApellido() + 
                                "\n\tDNI: " + T.p.getDNI() +                                 
                                "\n==============================================\n";
                    texto += a;
                    aux ++;                    
                    T = T.siguiente;
                }
            }
            Q = Q.siguiente;
        }
        return texto;
    }
    
    public String HistorialxPaciente (String codigo) {
        String texto = "";
        int aux = 1;
        ListaPaciente.NodoPaciente Q = this.pacientes.P;
        while (Q != null){
            if(Q.Pac.getDNI().equals(codigo)){
                texto = Q.Pac.historial.DarTextoDeServicios();                
            }
            Q = Q.siguiente;
        }
        return texto;
    }
    
    public Paciente ObtenerPaciente (String dni) {        
        Paciente p = new Paciente ();        
        ListaPaciente.NodoPaciente Q = this.pacientes.P;
        while(Q != null){           
            if(Q.Pac.getDNI().equals(dni)){
                p = Q.Pac;
            }
            Q = Q.siguiente;
        }        
        return p;
    }
    
    public Doctor ObtenerDoctorLL (String codigo) {
        Doctor d = new Doctor ();
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            if(Q.D.getCodigo().equals(codigo)){
                d = Q.D;
            }
            Q = Q.siguiente;
        }
        return d;
    }
    
    public Servicio ObtenerServicio (String dnipa, String nombredoc, String aplldoc) {
        Servicio s = new Servicio ();
        int aux = 1;
        ListaPaciente.NodoPaciente Q = this.pacientes.P;
        while (Q != null){
            if(Q.Pac.getDNI().equals(dnipa)){
                NodoServicio T = Q.Pac.historial.P;
                    while (T != null){
                        if(T.servicio.getDoc().contains(aplldoc + " " + nombredoc)){
                            s = T.servicio;
                        }
                        T = T.siguiente;
                    }
            }
            Q = Q.siguiente;
        }
        return s;
    }    
    
    //--------------------------ARBOLES----------------------------------------
    public String [] Arbol_recorrer () {
        String [] x = new String [31];
        for(int i=0; i<16;i++){
            x[i] = torneito.cuadro.obtener((2*i)+1).getNombre();
        }
        for(int i=16; i<24;i++){
            int aux = 4*i - 62;
            x[i] = torneito.cuadro.obtener(aux).getNombre();
        }
        for(int i=24; i<28;i++){
            int aux = 8*i - 188;
            x[i] = torneito.cuadro.obtener(aux).getNombre();
        }
        x[28]= torneito.cuadro.obtener(8).getNombre();
        x[29]= torneito.cuadro.obtener(24).getNombre();
        x[30]= torneito.cuadro.obtener(16).getNombre();
        return x;
    }
    
    public String [] Arbol_ponerPuntajes () {
        String [] x = new String [30];
        for(int i=0; i<16;i++){
            int aux = torneito.cuadro.obtener((2*i)+1).getPuntaje();
            x[i] = String.valueOf(aux);
        }
        for(int i=16; i<24;i++){
            int aux = 4*i - 62;            
            int aux2 = torneito.cuadro.obtener(aux).getPuntaje();
            x[i] = String.valueOf(aux2);
        }
        for(int i=24; i<28;i++){
            int aux = 8*i - 188;
            int aux2 = torneito.cuadro.obtener(aux).getPuntaje();
             x[i] = String.valueOf(aux2);
        }
        x[28]= String.valueOf(torneito.cuadro.obtener(8).getPuntaje ());
        x[29]= String.valueOf(torneito.cuadro.obtener(24).getPuntaje ());  
        return x;
    }
}
