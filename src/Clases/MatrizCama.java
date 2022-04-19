package Clases;

import java.io.Serializable;

public class MatrizCama implements Serializable {
    
    public Cama matriz [][] = new Cama [3][15];
    
    public MatrizCama () {
        for(int i=0; i<3; i++) {
            for(int j=0; j<15; j++) {
                matriz[i][j] = new Cama ();
            }
        }
        for(int y =0; y<5;y++){
            matriz [0][y].setSeccion("Neumología");
            matriz [0][y].setPiso(6);
            matriz [0][y].setNumero(matriz [0][y].getPiso()*100 + (y+1));
            matriz [1][y].setSeccion("Hematología");
            matriz [1][y].setPiso(5);
            matriz [1][y].setNumero(matriz [1][y].getPiso()*100 + (y+1));
            matriz [2][y].setSeccion("Medicina General");
            matriz [2][y].setPiso(4);
            matriz [2][y].setNumero(matriz [2][y].getPiso()*100 + (y+1));
        }
        for(int y = 5; y<10;y++){
            matriz [0][y].setSeccion("Nefrología");
            matriz [0][y].setPiso(6);
            matriz [0][y].setNumero(matriz [0][y].getPiso()*100 + (y+1));
            matriz [1][y].setSeccion("Traumatología");
            matriz [1][y].setPiso(5);
            matriz [1][y].setNumero(matriz [1][y].getPiso()*100 + (y+1));
            matriz [2][y].setSeccion("Cardiología");
            matriz [2][y].setPiso(4);
            matriz [2][y].setNumero(matriz [2][y].getPiso()*100 + (y+1));
        }
        for(int y =10; y<15;y++){
            matriz [0][y].setSeccion("Reumatología");
            matriz [0][y].setPiso(6);
            matriz [0][y].setNumero(matriz [0][y].getPiso()*100 + (y+1));
            matriz [1][y].setSeccion("Geriatría");
            matriz [1][y].setPiso(5);
            matriz [1][y].setNumero(matriz [1][y].getPiso()*100 + (y+1));
            matriz [2][y].setSeccion("Dermatología");
            matriz [2][y].setPiso(4);
            matriz [2][y].setNumero(matriz [2][y].getPiso()*100 + (y+1));
        }
    }   

    public String [] ObtenerNumeros (String esp){
        int aux = 0;
        String r[] = new String [5];
        for(int i=0; i<3; i++) {
            for(int j=0; j<15; j++) {
                if(matriz [i][j].getSeccion().equals(esp)){
                   if(matriz [i][j].isUso()){
                       String num = String.valueOf(matriz [i][j].getNumero());
                        r[aux] = num + " - OCUPADO";
                   }else{
                       r[aux] = String.valueOf(matriz [i][j].getNumero());
                   }                    
                   aux ++;  
                }
            }
        }
        return r;
    }
    
    public String [] ObtenerNumeros2 (String esp){
        int aux = 0;
        String r[] = new String [5];
        for(int i=0; i<3; i++) {
            for(int j=0; j<15; j++) {
                if(matriz [i][j].getSeccion().equals(esp)){
                   r[aux] = String.valueOf(matriz [i][j].getNumero());                                      
                   aux ++;  
                }
            }
        }
        return r;
    }
    
    public void AsignandoPaciente (Paciente p, String numcama) {
        int numero, aux, aux2, x, y;
        numero = Integer.parseInt(numcama);
        aux = numero / 100;
        x = 6 - aux;
        aux2 = numero % 100;
        y = aux2 - 1;
        matriz[x][y].setPaciente(p);
        matriz[x][y].setUso(true);
    }
    
    public void DesasignarPaciente (String numcama) {
        Paciente vacio = new Paciente ();
        int numero, aux, aux2, x, y;
        numero = Integer.parseInt(numcama);
        aux = numero / 100;
        x = 6 - aux;
        aux2 = numero % 100;
        y = aux2 - 1;
        matriz[x][y].setPaciente(vacio);
        matriz[x][y].setUso(false);
    }
    
    public String [][] DatosCamaxEspecialidad (String especialidad) {
        String [][] result = new String[5][5];
        int indice = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<15; j++) {
                if(matriz[i][j].getSeccion().equals(especialidad)){
                    result[indice][0] = String.valueOf(matriz[i][j].getPiso());
                    result[indice][1] = String.valueOf(matriz[i][j].getNumero());
                    result[indice][2] = matriz[i][j].getSeccion();
                    if(matriz[i][j].isUso()){
                        result[indice][3] = "Ocupado";
                    }else{
                        result[indice][3] = "Disponible";
                    }
                    result[indice][4] = matriz[i][j].getPaciente().getNombre() +
                            " " + matriz[i][j].getPaciente().getApellido();
                    indice ++;
                }
            }
        }
        return result;
    }
    
    public void  editarNivelUrgencia(String numeroCama,int urgencia){
        int result[]=convertirCama(numeroCama);
        int piso=result[0];
        int posicionCama=result[1];
        matriz[piso][posicionCama].setUrgencia(urgencia);
        matriz[piso][posicionCama].setUso(true);
    }
    
    private int[] convertirCama(String numcama){
        int numero, aux, aux2, x, y;
        numero = Integer.parseInt(numcama);
        aux = numero / 100;
        x = 6 - aux;
        aux2 = numero % 100;
        y = aux2 - 1;
        return new int[]{x,y};
    }

    public String ObtenerNumeroCama(String codigo) {
        String numero = "";
        for(int i=0; i<3; i++) {
            for(int j=0; j<15; j++) {
                if(matriz[i][j].paciente.getDNI().equals(codigo)){
                    numero = String.valueOf(matriz[i][j].getNumero());
                }
            }
        }        
        return numero;
    }
    
}
