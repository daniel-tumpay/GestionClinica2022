package Grafos;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Algoritmo_Floyd {
    
    private int[][] D;
    private int[][] Path;
    private int MAX=100000;
    private int N=0;
    
    public Algoritmo_Floyd(int[][] L){
        N=L.length;
        D= new int[N][N];
        Path= new int[N][N];
        //Inicializar la Matriz de incidencias
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                D[i][j]=L[i][j];
                //Inicializa la ruta de caminos minimos
                if(D[i][j]==MAX){
                    Path[i][j]=-1;
                }
                else Path[i][j]=i;
            }
        }
        //Tambien indicamos que no tiene que ir a ninguna parte para ir de i a i
        for(int i=0;i<N;i++) {
            Path[i][i]=i;
        }
    }
    
    public  void operarCaminoMinimo(){
        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if((D[i][k]+D[k][j])<D[i][j]){
                        D[i][j]=D[i][k]+D[k][j];
                        Path[i][j]=Path[k][j];
                    }
                }
            }
        }
    }
    
   public void printMatrizIncidencias(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                //Ingresar un metodo de Impresion
                System.out.print(D[i][j]+" ");
               
            }
             System.out.println();
        }
   }
   
   public int obtenerPeso(int i,int j){
       return D[i][j];
   }
   
   public int[] obtenerCaminoMinimo(int start,int end){
      String ruta=end+"";
       //recorrer los vertices
       int recorrido[]= new int[20];
       while(Path[start][end]!=start){
           ruta=Path[start][end]+"->"+ruta;
           end=Path[start][end];
           if(end==-1) break;
       }
       if(end!=-1){
       //agregar el comienzo
       ruta=start+"->"+ruta;
       int count=0;
       StringTokenizer st= new StringTokenizer(ruta,"->");
       while(st.hasMoreTokens()){
          String nextToken = st.nextToken();
          recorrido[count]=Integer.parseInt(nextToken);
          count++;
       }
       recorrido[count] = -1;
       }else{
           recorrido=null;
       }
       return recorrido;
   }
   
   public String obtenerRecorrido(int start,int end){
       Map<Integer,String> mapeo= new HashMap();
       mapeo.put(0,"A");mapeo.put(1,"B");mapeo.put(2,"C");mapeo.put(3,"D");
       mapeo.put(4,"E");mapeo.put(5,"F");mapeo.put(6,"G");mapeo.put(7,"H");mapeo.put(8,"I");
       
       String ruta=mapeo.get(end)+"";
     
       while(Path[start][end]!=start){
           ruta=mapeo.get(Path[start][end])+"->"+ruta;
           end=Path[start][end];
       }
       //agregar el comienzo
       ruta=mapeo.get(start)+"->"+ruta;
       return ruta;
   }
}
