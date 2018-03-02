
package lab.pkg5_ricardogonzalez_11651018;
public class Character {
    private String nombre;
    private String poder;
    private String debilidad;
    private Squad escuadron;
    private int fuerza;
    private int agilidad;
    private int mental;

    public Character() {
    }

    public Character(String nombre, String poder, String debilidad, Squad escuadron, int fuerza, int agilidad, int mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.mental = mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Squad getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Squad escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    @Override
    public String toString() {
        return nombre + " , " + poder;
    }
    
    
}
