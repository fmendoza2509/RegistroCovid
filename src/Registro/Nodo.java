package registro;
public class Nodo {
    /***********************************************************
     *Declaramos un objeto donde se va a guardar la información*
     *de cada parroquia                                        *
     ***********************************************************/
    private Object valor;
    /*************************************************************
     *Declaramos un objeto del mismo tipo del nodo que almacenará*
     *la referencia al siguiente nodo                            *
     *************************************************************/
    private Nodo sgte;
    //Constructor
    public Nodo(Object valor) {
        setValor(valor);
        setSgte(null);
    }
    //Métodos Setters
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    //Métodos Getters
    public Object getValor() {
        return valor;
    }
    public Nodo getSgte() {
        return sgte;
    }
    //Método para enlazar al siguiente nodo
    public void EnlazarSiguiente(Nodo n) {
        setSgte(n);
    }
    //Método para que nos retorne el valor del siguiente nodo
    public Nodo ObtenerSiguiente() {
        return getSgte();
    }
    //Método para obtener el valor de este nodo
    public Object ObtenerValor() {
        return getValor();
    }
}
