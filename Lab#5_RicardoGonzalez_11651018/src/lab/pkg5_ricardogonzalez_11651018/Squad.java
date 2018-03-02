
package lab.pkg5_ricardogonzalez_11651018;

import java.util.ArrayList;

public class Squad {
    private String nombre;
    private String localidad;
    private String lema;
    private String lider;
    private String tipo;
    private ArrayList<Character> Miembros = new ArrayList();

    public Squad() {
    }

    public Squad(String nombre, String localidad, String lema, String lider, String tipo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lema = lema;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Character> getMiembros() {
        return Miembros;
    }

    public void setMiembros(ArrayList<Character> Miembros) {
        this.Miembros = Miembros;
    }

    @Override
    public String toString() {
        return nombre + " - " + localidad;
    }
    
    
}
