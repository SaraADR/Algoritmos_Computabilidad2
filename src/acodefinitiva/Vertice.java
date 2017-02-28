
package acodefinitiva;


public class Vertice {
    int nombre;
    int etapa;

    public Vertice(int nombre, int etapa) {
        this.nombre = nombre;
        this.etapa = etapa;
    }

    public int getNombre() {
        return nombre;
    }

    public int getEtapa() {
        return etapa;
    }

    @Override
    public String toString() {
        return "Vertice{" + "nombre=" + nombre + ", etapa=" + etapa + '}';
    }
    
}
