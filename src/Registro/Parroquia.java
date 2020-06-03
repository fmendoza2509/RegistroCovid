package registro;
public class Parroquia {
    //Declaramos las variables necesarias
    private String NonmbParroquia;
    private int NumContagiados;
    private int NumDecesos;
    private int NumHospitalizados;
    private int NumDescartados;
    private int NumTotalPruebas;
    private int NumRecuperados;
    //Constructor Vacio o por defecto
    public Parroquia() {
        this.NonmbParroquia="";
        this.NumContagiados=0;
        this.NumDecesos=0;
        this.NumHospitalizados=0;
        this.NumDescartados=0;
        this.NumTotalPruebas=0;
        this.NumRecuperados=0;
    }
    //Constructor con parametros
    public Parroquia(String np, int Nc, int nd, int nh, int ndesc, int ntp, int nrecup) {
        setParroquia(np);
        setContagio(Nc);
        setDecesos(nd);
        setHospitalizados(nh);
        setDescartados(ndesc);
        setTotalPruebas(ntp);
        setRecuperados(nrecup);
    }
    //Métodos setters
    public void setContagio(int n) {
    }
    public void setParroquia(String par) {
    }
    public void setDecesos(int n) {
    }
    public void setHospitalizados(int n) {
    }
    public void setDescartados(int n) {
    }
    public void setTotalPruebas(int n) {
    }
    public void setRecuperados(int n) {
    }
    //Métodos Getters
    public String getParroquia() {
        
    }
    public int getContagios() {
        
    }
    public int getDecesos() {
        
    }
    public int getHospitalizados() {
        
    }
    public int getDescartados() {
        
    }
    public int getTotalPruebas() {
        
    }
    public int getRecuperados() {
        
    }
    //Método para leer los datos
    public void Leer() {
    }
    //Método para imprimir
    public String toString() {
        return "Parroquia: "+getParroquia()+"\nNúmero de contagiados: "+getContagios()
                +"\nFallecidos: "+getDecesos()+"\nHospitalizados: "+getHospitalizados()
                +"\nRecuperados: "+getRecuperados()+"\nCasos Descartados: "+getDescartados()
                +"\nTotal de pruebas: "+getTotalPruebas();
    }
}
