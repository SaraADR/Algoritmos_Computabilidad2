
package acodefinitiva;

import java.util.ArrayList;

public class ACOdefinitiva {

    public static void main(String[] args) {
        
        Vertice uno=new Vertice(0,0);
        Vertice dos=new Vertice(1,1);
        Vertice tres=new Vertice(2,1);
        Vertice cuatro=new Vertice(3,1);
        Vertice cinco=new Vertice(4,2);
        Vertice seis=new Vertice(5,2);
        Vertice siete=new Vertice(6,3);
        
        int etapas=4;
        Grafo G =new Grafo(7, etapas);
        G.conectar(uno, dos, 2);
        G.conectar(uno, tres, 3);
        G.conectar(uno, cuatro, 1);
        G.conectar(dos, seis, 1);
        G.conectar(dos, cuatro, 2);
        G.conectar(cuatro, seis, 3);
        G.conectar(tres, cinco, 2);
        G.conectar(tres, siete, 4);
        G.conectar(dos, cinco, 1);
        G.conectar(cinco, siete, 2);
        G.conectar(cinco, seis, 4);
        G.conectar(seis, siete, 5);
        
        ArrayList Datos = G.getListAristas();
        Datos = Auxiliar.auxiliar(Datos);
        recorrido.Aux(G, Datos);
        
          //---------------------------------------------------------------------------------
  
        Vertice u=new Vertice(0,0);
        Vertice d=new Vertice(1,1);
        Vertice t=new Vertice(2,1);
        Vertice c=new Vertice(3,1);
        Vertice p=new Vertice(4,2);
        Vertice m=new Vertice(5,2);
        Vertice n=new Vertice(6,2);
        Vertice l=new Vertice(7,3);
         etapas=4;
        Grafo V =new Grafo(8, etapas);
        V.conectar(u, d, 1);
        V.conectar(u, t, 3);
        V.conectar(u, c, 2);
        V.conectar(d, p, 5);
        V.conectar(d, n, 3);
        V.conectar(c, m, 2);
        V.conectar(c, n, 7);
        V.conectar(t, p, 4);
        V.conectar(t, m, 3);
        V.conectar(n, l, 1);
        V.conectar(m, l, 1);
        V.conectar(p, l, 4);
        
        ArrayList Datos2 = V.getListAristas();
        Datos2 = Auxiliar.auxiliar(Datos2);
        recorrido.Aux(V, Datos2);
        
        
      
        
    }
}