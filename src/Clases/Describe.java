package Clases;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Describe {
    
    private String dato= "\n  La Clínica \"Los Angeles\" ubicado en Villa El Salvador ofrece ofrece:\t"
        + "\n -  9 especialidades médicas para hospitalizacion y emergencias\n "
        + "\n -  12 especialidades médicas para consultas\n"
        
        + "\n Todo ello con un avanzado equipamiento digital, sistemas de información \n"
        + "\n y la tecnología de comunicaciones que permiten agilizar y optimizar la atención del asegurado.\n" 
        +"\n  El hospital dispone 45 camas para hospitalización y 15 para emergencias\n"
        + "\n -  12 consultorios para las citas medicas\n"
        + "\n a) Especialidad de                             -   b) Especialidad de Consultas:\n"
        +"\n Hospitalizacion y Emergencias:      -   *Neumología\n "
        +"\n *Hematología                                     -    *Hematología\n"
        +"\n *Medicina General                             -   *Medicina General\n"
        +"\n *Nefrología                                         -    *Nefrología\n"
        +"\n *Traumatología                                  -    *Traumatología\n"
        +"\n *Cardiología                                       -    *Cardiología\n"
        +"\n *Geriatría                                             -    *Geriatría\n"
        +"\n *Reumatología                                   -    *Reumatología\n"
        +"\n *Dermatología                                   -    *Dermatología\n"
        +"\n *Neumología                                      -    *Odontologia\n"
        +"\n                                                                -    *Nutricion\n"
        +"\n                                                                -    *Psicología\n";
    
    
    public void Crear() throws  FileNotFoundException, IOException{
        
        FileWriter trabajo = new FileWriter ("Descripcion.txt");
        trabajo.write(dato);
        trabajo.close();
    }
}
