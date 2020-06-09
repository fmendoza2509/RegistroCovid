package registro;

import java.util.Scanner;

public class Casos implements InterfaceCasos{
    private Scanner lector = new Scanner(System.in);
    //Declaramos las variables necesarias
    private int NumContagiados;
    private int NumDecesos;
    private int NumHospitalizados;
    private int NumDescartados;
    private int NumTotalPruebas;
    private int NumRecuperados;
    private int Dia;
    private int Mes;
    private int Anio;
    //Constructor Vacio o por defecto
    public Casos() {
        this.NumContagiados=0;
        this.NumDecesos=0;
        this.NumHospitalizados=0;
        this.NumDescartados=0;
        this.NumTotalPruebas=0;
        this.NumRecuperados=0;
    }
    //Constructor con parametros
    public Casos(String np, int Nc, int nd, int nh, int ndesc, int ntp, int nrecup) {
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
    public void setDia(int Dia) {
        this.Dia = Dia;
    }
    public void setMes(int Mes) {
        this.Mes = Mes;
    }
    public void setAnio(int Anio) {
        this.Anio = Anio;
    }
    //Métodos Getters
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
    public int getDia() {
        return Dia;
    }
    public int getMes() {
        return Mes;
    }
    public int getAnio() {
        return Anio;
    }
    //Método para leer los datos
    public void Leer() {
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
        return( "Número de contagiados: "+getContagios()
                +"\nFallecidos: "+getDecesos()+"\nHospitalizados: "+getHospitalizados()
                +"\nRecuperados: "+getRecuperados()+"\nCasos Descartados: "+getDescartados()
                +"\nTotal de pruebas: "+getTotalPruebas());
    }
}
