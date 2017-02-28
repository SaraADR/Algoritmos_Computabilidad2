/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acodefinitiva;

public class Arista {
    Vertice ini;
    Vertice fin;
    int coste;

    public int getEtapaDeArista() {
        return EtapaDeArista;
    }

    @Override
    public String toString() {
        return "Arista{" + "ini=" + ini + ", fin=" + fin + ", coste=" + coste + ", EtapaDeArista=" + EtapaDeArista + '}';
    }
    int EtapaDeArista;

    public Arista(Vertice ini, Vertice fin, int coste) {
        this.ini = ini;
        this.fin = fin;
        this.coste = coste;
        if(ini.getEtapa()> fin.getEtapa()){
            this.EtapaDeArista=fin.getEtapa();
        }else{
            this.EtapaDeArista=ini.getEtapa();
        }

    }

    public Vertice getIni() {
        return ini;
    }

    public Vertice getFin() {
        return fin;
    }

    public int getCoste() {
        return coste;
    }
}
