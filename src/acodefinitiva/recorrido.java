
package acodefinitiva;


import java.util.ArrayList;


public class recorrido {
    
       public static void Aux(Grafo G, ArrayList Datos){
        int costeTotal=Integer.MAX_VALUE; 
        Arista[] anterior=new Arista[G.getEtapas()];
        Recursivo(Datos, costeTotal, G.getEtapas(), anterior);
        /* Primero que nada, nos creamos un coste total que va a ser con el que comparar para hacer la poda
        una arista anterior donde guardar la ultima solucion valida y mandamos la lista, el total, el numero de etapas y el anterior
        */
    }
    
    
    
    public static void Recursivo(ArrayList Datos, int costeTotal, int nEtapas, Arista[] anterior){       
        //nos creamos un array donde guardar una posible solucion
        Arista[] posibilidad=new Arista[nEtapas-1];
        //la i sera la que nos llevara las etapas debe ir desde 0 hasta netapas-1 (abajo lo miramos)
        int i=0;
        int costeParcial=0;
        //Caso base, si se ha recorrido todo el array devolvemos la ultima solucion valida
        if(Datos.isEmpty()){
            exponer(anterior);
            return;
        }
        
        for (int j = 0; j < Datos.size(); j++) {
            //recorremos todo el grafo, tantas veces como etapas tengamos
            if(i > nEtapas-1){
                break;
            }
            Arista aux = (Arista) Datos.get(j);
            //caso i != 0 , miramos que este conectado con el i=0, y que su coste no se exeda si es asi, lo metemos en posibilidad.
            if( i!=0 ){
                 if(posibilidad[i-1].getFin()==aux.getIni() && costeParcial+aux.getCoste()<costeTotal){
                        posibilidad[i]=aux;
                        costeParcial=costeParcial+aux.getCoste();
                        i++;
                    }
            }else{
                //caso 0 si es apto con el coste lo metemos y avanzamos etapa
                if(costeParcial+aux.getCoste() < costeTotal){
                    posibilidad[i]=aux;
                    costeParcial=costeParcial+aux.getCoste();
                    i++;
                }
            }
            
        }
        //Aqui nos encontramos con otro caso base. Puede ser que una vez recorrido el for no haya
        //un elemento para cada etapa por que no queden o por que el coste no se lo permita, eso significa
        //Que se han acanado las posibilidades, asi que se quedara a nulo alguna parte de posibilidad. 
        //Si esto es asi devolvemos el anterior, que es el ultimo valido.
        for (Arista posibilidad1 : posibilidad) {
            if (posibilidad1 == null) {
                exponer(anterior);
                return;
                
            }
        }
        //en el caso de que este si sea uno valido, tenemos que comprobar si hay mas, para ello
        //nos cargamos el ultimo elemento del Array para obligarle a seguir otro camino que llegue hasta el final
        Arista arista= posibilidad[posibilidad.length-1];
        Datos = borrado(Datos, arista); 
        

        Recursivo(Datos, costeParcial, nEtapas, posibilidad);
    }
    
    
    
    public static ArrayList borrado( ArrayList Datos , Arista observada){
        //en este caso se carga el elemento y mira si se puede cargar alguno mas
        //es una volada muy grande que nose como coño me salio, pero funciona, tampoco lo toques 
        //por que yo intente hacerlo y tuve que ir al anterior a volverlo a poner como estaba :'(
        
        Datos.remove(observada);
        
        for (int i = 0; i < Datos.size(); i++) {
            Arista aux = (Arista) Datos.get(i);
            if(observada.getIni()==aux.getIni()){
                return Datos;
            }
        }
        for (int i = 0; i < Datos.size(); i++) {
            Arista aux = (Arista) Datos.get(i);
            if(observada.getIni()==aux.getFin()){
                borrado(Datos,aux);
            }
        }

        return Datos;
    }

    private static void exponer(Arista[] anterior) {
        
        //ESTO DA EL RESULTADO. no he conseguido otra manera de que el resultado se de por pantalla.
        //si hago los return arriba con anterior.. no sale :(
      String s = "";
        for (int i = 0; i < anterior.length; i++) {
            Arista arista = anterior[i];
           s= s.concat("["+ arista.getIni().getNombre() + "," + arista.getFin().getNombre()+ "]");
        }
        System.out.println(s);
    }

}
