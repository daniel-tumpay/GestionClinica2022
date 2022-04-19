package Grafos;

import Clases.Cama;
import Clases.MatrizCama;

public class AtencionMinima {
    
    private final int INF=100000;
    private int piso =0;
    private final MatrizCama matrizCamas;
    private  int matrizIncidencias[][]=new int[9][9];
    private Algoritmo_Floyd floyd;
    
    public AtencionMinima(MatrizCama matrizCama,int piso){
        this.piso=piso; 
        this.matrizCamas=matrizCama;
    }
    
    public int[] getVerticesMinimos(){
        return getVerticesMinimos(0,8);
    }
    
    public int[] getVerticesMinimos(int start,int end){
        int[][] incidencia= obtenerMatrizIncidencia();
        floyd= new Algoritmo_Floyd(incidencia);
        floyd.operarCaminoMinimo();
        int[] camino=floyd.obtenerCaminoMinimo(start,end);
        return camino;
    }
    
    public int[][] obtenerMatrizIncidencia(){
  
       Cama incidenciaCamas[][]=obtenerCamasIncidentes();
       for(int i=0;i<incidenciaCamas.length;i++){
           for(int j=0;j<incidenciaCamas[i].length;j++){
               if(incidenciaCamas[i][j]==null ){
                   matrizIncidencias[i][j]=INF;
               }else if(i==j){
                   //|| incidenciaCamas[i][j].isUso()==false
                   matrizIncidencias[i][j]=0;
               }else if(incidenciaCamas[i][j].isUso()==false){
                   matrizIncidencias[i][j]=INF;
               }else
               {
                   matrizIncidencias[i][j]=incidenciaCamas[i][j].getUrgencia();
               }
           }
       }
        
        return matrizIncidencias;
    }
    
    public Cama[][] obtenerCamasIncidentes(){
       Cama camas[] = matrizCamas.matriz[piso];
       Cama[][] camasIncidentes= new Cama[][]{
            {null,camas[0],null,camas[2],camas[3],null,null,null,null},
            {camas[0],null,camas[1],null,camas[4],null,null,null,null},
            {null,camas[1],null,null,camas[5],camas[6],null,null,null},
            {camas[2],null,null,null,camas[7],null,camas[9],null,null},
            {camas[3],camas[4],camas[5],camas[7],null,camas[8],camas[10],null,camas[11]},
            {null,null,camas[6],null,camas[8],null,null,null,camas[12]},
            {null,null,null,camas[9],camas[10],null,null,camas[13],null},
            {null,null,null,null,null,null,camas[13],null,camas[14]},
            {null,null,null,null,camas[11],camas[12],null,camas[14],null}
        };
       return camasIncidentes;
    }
    
    public String obtenerRecorrido(){
        return floyd.obtenerRecorrido(0, 8);
    }
}
