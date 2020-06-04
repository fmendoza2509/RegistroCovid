package registro;
public class NodoParroquia {
    /***********************************************************
     *Declaramos un objeto donde se va a guardar la información*
     *de cada parroquia                                        *
     ***********************************************************/
    private Object valor;
    /*************************************************************
     *Declaramos un objeto del mismo tipo del nodo que almacenará*
     *la referencia al siguiente nodo                            *
     *************************************************************/
    private NodoParroquia sgte;
    //Constructor
    public NodoParroquia(Object valor) {
        setValor(valor);
        setSgte(null);
    }
    //Métodos Setters
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public void setSgte(NodoParroquia sgte) {
        this.sgte = sgte;
    }
    //Métodos Getters
    public Object getValor() {
        return valor;
    }
    public NodoParroquia getSgte() {
        return sgte;
    }
    //Método para enlazar al siguiente nodo
    public void EnlazarSiguiente(NodoParroquia n) {
        setSgte(n);
    }
    //Método para que nos retorne el valor del siguiente nodo
    public NodoParroquia ObtenerSiguiente() {
        return getSgte();
    }
    //Método para obtener el valor de este nodo
    public Object ObtenerValor() {
        return getValor();
    }
}
