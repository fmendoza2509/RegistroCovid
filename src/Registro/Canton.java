package registro;
public class Canton implements InterfaceCanton {
    /*********************************************
     *Creamos la cabeza de la lista referenciando*
     *al NodoParroquia                           *
     *********************************************/
    private NodoParroquia Cabeza;
    /********************************************
     *Creamos una variable para ver el tamaño de* 
     *la lista enlazada                         *
     ********************************************/
    private int Tam;
    //Constructor
    public Canton() {
        setCabeza(null);
        setTam(0);
    }

    public void setCabeza(NodoParroquia n) {
        Cabeza = n;
    }

    public void setTam(int t) {
        Tam = t;
    }

    public NodoParroquia getCabeza() {
        return Cabeza;
    }

    public int getTam() {
        return Tam;
    }
    //Método para añadir el primer elemento a la lista
    @Override
    public void AddPrimero(Object elemento) {
        /*************************************
         *Verificamos si la cabeza esta vacia*
         *y si lo está agregamos el elemento *
         *************************************/
        if(Cabeza==null){
            Cabeza = new NodoParroquia(elemento);
        }else {
             //Caso contrario, es decir no esta vacía
             //Creamos un nodo temporal que sea igual a la cabeza
            NodoParroquia temp = Cabeza;
            NodoParroquia nuevo = new NodoParroquia(elemento);//Cramos un nuevo objeto de la clase Nodo
            nuevo.EnlazarSiguiente(temp);//Enlazamos el nuevo nodo temporal
            Cabeza = nuevo;//Hcemos el cambio de valores para que el nuevo nodo sea la cabeza
        }
        Tam++;
    }
    //Método para saber si la cabeza está vacia
    @Override
    public boolean Vacio() {
        return (Cabeza==null)?true:false;
    }
    //Método para obtener el valor de un nodo de una lista
    @Override
    public Object Obtener(int i) {
        int contador = 0;
        NodoParroquia temp = Cabeza;
        while(contador<i){
            temp = temp.ObtenerSiguiente();
            contador++;
        }
        return temp.ObtenerValor();
    }
    //Método para eliminar el primer elemento de la lista
    @Override
    public void EliminarPrimero() {
        Cabeza = Cabeza.ObtenerSiguiente();
        Tam--;
    }
    //Método para eliminar cualquier elemento de la lista
    @Override
    public void Eliminar(int i) {
        int contador = 0;
        NodoParroquia temp = Cabeza;
        if(i==0){
            Cabeza = Cabeza.ObtenerSiguiente();
        }else {
            while(contador<i-1){
                temp = temp.ObtenerSiguiente();
                contador++;
            }
            temp.EnlazarSiguiente(temp.ObtenerSiguiente().ObtenerSiguiente());
        }
        Tam--;
    }
    //Método para imprimir
    @Override
    public void Imprimir(){
        for(int i=0;i<getTam();i++){
            System.out.println(Obtener(i));
        }
    }
}
