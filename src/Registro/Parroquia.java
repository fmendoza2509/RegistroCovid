package registro;

import java.util.Scanner;

public class Parroquia {
    private Scanner lector = new Scanner(System.in);
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
        NumContagiados=n;
    }
    public void setParroquia(String par) {
        NonmbParroquia=par;
    }
    public void setDecesos(int n) {
        NumDecesos=n;
    }
    public void setHospitalizados(int n) {
        NumHospitalizados=n;
    }
    public void setDescartados(int n) {
        NumDescartados=n;
    }
    public void setTotalPruebas(int n) {
        NumTotalPruebas=n;
    }
    public void setRecuperados(int n) {
        NumRecuperados=n;
    }
    //Métodos Getters
    public String getParroquia() {
     return NonmbParroquia;   
    }
    public int getContagios() {
     return NumContagiados;   
    }
    public int getDecesos() {
     return NumDecesos;   
    }
    public int getHospitalizados() {
     return NumHospitalizados;   
    }
    public int getDescartados() {
    return NumDescartados;    
    }
    public int getTotalPruebas() {
     return NumTotalPruebas;   
    }
    public int getRecuperados() {
    return NumRecuperados;    
    }
    //Método para leer los datos
    public void Leer() {
        System.out.println("Ingrese en nombre de la parroquia");
        setParroquia(lector.nextLine());
        System.out.println("Ingrese el número de contagiados");
        setContagio(lector.nextInt());
        System.out.println("Ingrese el número de fallecidos");
        setDecesos(lector.nextInt());
        System.out.println("Ingrese el número de hospitalizados");
        setHospitalizados(lector.nextInt());
        System.out.println("Ingrese el número de pacientes recuperados");
        setRecuperados(lector.nextInt());
        System.out.println("Ingrese el número de personas descartadas");
        setDescartados(lector.nextInt());
        System.out.println("Ingrese el número total de pruebas");
        setTotalPruebas(lector.nextInt());
    }
    //Método para imprimir
    public String toString() {
        return( "Parroquia: "+getParroquia()+"\nNúmero de contagiados: "+getContagios()
                +"\nFallecidos: "+getDecesos()+"\nHospitalizados: "+getHospitalizados()
                +"\nRecuperados: "+getRecuperados()+"\nCasos Descartados: "+getDescartados()
                +"\nTotal de pruebas: "+getTotalPruebas());
    }
}
