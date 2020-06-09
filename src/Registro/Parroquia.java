package Registro;
public class Parroquia {
    private String Nombre;
    private Nodo Cabeza;
    private int Tam;

    public Parroquia(String Nombre, Nodo Cabeza, int Tam) {
        setNombre(Nombre);
        setCabeza(Cabeza);
        setTam(Tam);
    }
    //Métodos Setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    public void setTam(int Tam) {
        this.Tam = Tam;
    }
    //Métodos Getter
    public String getNombre() {
        return Nombre;
    }
    public Nodo getCabeza() {
        return Cabeza;
    }
    public int getTam() {
        return Tam;
    }
    
}
