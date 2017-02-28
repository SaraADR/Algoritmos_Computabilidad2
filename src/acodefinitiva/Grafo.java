
package acodefinitiva;


import java.util.ArrayList;

public class Grafo {
    int nVertices;
    int Etapas;
    //En vez de tener una matriz de adyacencia y una de costes tenemos solo una,
    //donde no caiga Integer.maxValue es que estan conectados y su valor es el 
    //coste entre los dos vertices
    int[][] adyaCostes;
    ArrayList ListAristas;
    int nAristas=0;

    public Grafo(int nVertices, int Etapas) {
        this.nVertices = nVertices;
        this.Etapas = Etapas;
        this.adyaCostes = new int[nVertices][nVertices];
        this.ListAristas = new ArrayList();
        for (int i = 0; i < nVertices; i++) {
            for (int j = 0; j < nVertices; j++) {
                adyaCostes[i][j]=Integer.MAX_VALUE; 
            }
        }
    }
   public int getnAristas() {
        return nAristas;
    }
    public int getnVertices() {
        return nVertices;
    }

    public int getEtapas() {
        return Etapas;
    }

    public int[][] getAdyaCostes() {
        return adyaCostes;
    }
//Devuelve una lista con todas las aristas que haya, es la clave para el resto
    public ArrayList getListAristas() {
        return ListAristas;
    }
    public boolean Conectados(Vertice A, Vertice B){
        return adyaCostes[A.getNombre()][B.getNombre()]!=Integer.MAX_VALUE;
    }
    public void conectar(Vertice A, Vertice B, int coste){
        adyaCostes[A.getNombre()][B.getNombre()]=coste;
        adyaCostes[B.getNombre()][A.getNombre()]=coste;
        nAristas++;
        ListAristas.add(new Arista(A,B,coste));
    }
 
}

