
package acodefinitiva;

import java.util.ArrayList;

public class Auxiliar {
    //Este metodo lo unico que hace es quitar uniones entre la misma etapa
    //es un mini parche por que sino no se podian borrar. Dejalo quieto xD
    public static ArrayList auxiliar(ArrayList Datos){
        for (int i = 0; i < Datos.size(); i++) {
            Arista aux = (Arista) Datos.get(i);
            if(aux.getIni().getEtapa() == aux.getFin().getEtapa()){
                Datos.remove(aux);
            }
            
        }
        return Datos;
    }
    
}
