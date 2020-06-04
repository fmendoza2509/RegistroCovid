package registro;

import java.util.Scanner;

public class MainRegistroCovid {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String NombreCanton="";
        Parroquia oParr = new Parroquia();
        Canton oCant = new Canton();
        int nContagiados,nDecesos,nHospitalizados,nDescartados,nRecuperados,nTPruebas,op;
        nContagiados=nDecesos=nHospitalizados=nDescartados=nRecuperados=nTPruebas=op=0;
        System.out.println("Ingrese el nombre del canton");
        NombreCanton = lector.nextLine();
        do {
            System.out.println("Ingrese una de las siguientes opciones del menú");
            System.out.println("(1) Para agregar parroquia");
            System.out.println("(2) Para imprimir las métricas por parroquia");
            System.out.println("(3) Para imprimir la métrica cantonal");
            System.out.println("(4) Para salir");
            op = lector.nextInt();
            switch (op) {
                case 1:
                    oParr.Leer();
                    nContagiados = nContagiados + oParr.getContagios();
                    nHospitalizados = nHospitalizados + oParr.getHospitalizados();
                    nRecuperados = nRecuperados + oParr.getRecuperados();
                    nDecesos = nDecesos + oParr.getDecesos();
                    nDescartados = nDescartados + oParr.getDescartados();
                    nTPruebas = nTPruebas + oParr.getTotalPruebas();
                    oCant.AddPrimero(oParr);
                    break;
                case 2:
                    oCant.Imprimir();
                    break;
                case 3:
                    System.out.println("Cantón: " + NombreCanton);
                    System.out.println("Número de personas contagiadas: " + nContagiados);
                    System.out.println("Número de personas hospitalizadas: " + nHospitalizados);
                    System.out.println("Número de personas recuperadas: " + nRecuperados);
                    System.out.println("Número de personas fallecidas: " + nDecesos);
                    System.out.println("Número de personas descartadas: " + nDescartados);
                    System.out.println("Número total de pruebas: " + nTPruebas);
                    break;
                default:
                    System.out.println("Escoja una opción válida y vuela a intentarlo");
                    break;
            }
        } while (op != 4);
    }
}
