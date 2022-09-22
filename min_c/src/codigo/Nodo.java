/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.io.File;
import java.util.ArrayList;

public class Nodo {
    private String etiqueta;
    private ArrayList<Nodo> hijos = new ArrayList<>();
    private int idNodo;
    

    public Nodo() {
    }

   
    /////
    public Nodo(String _etiqueta, int _idNodo) {
        this.etiqueta = _etiqueta;
        this.idNodo = _idNodo;
        
    }    

    @Override
    public String toString() {
        return idNodo + " [label=\"" + etiqueta +"\"];";
    }

    public void addHijo(Nodo hijo) {
        this.hijos.add(hijo);
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    public int getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(int idNodo) {
        this.idNodo = idNodo;
    }
    
}





