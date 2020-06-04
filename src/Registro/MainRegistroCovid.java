package registro;

import java.util.Scanner;

public class MainRegistroCovid {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String NombreCanton="";
        int nContagiados,nDecesos,nHospitalizados,nDescartados,nRecuperados,nTPruebas,op;
        nContagiados=nDecesos=nHospitalizados=nDescartados=nRecuperados=nTPruebas=op=0;
        System.out.println("Ingrese el nombre del canton");
        NombreCanton = lector.nextLine();
        do{
            do{
                System.out.println("Ingrese una de las siguientes opciones del menú");
                System.out.println("(1) Para agregar parroquia");
                System.out.println("(2) Para imprimir las métricas por parroquia");
                System.out.println("(3) Para imprimir la métrica cantonal");
                System.out.println("(4) Para salir");
                op = lector.nextInt();
                switch(op){
                    case 1:
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                }
            }while((op>0)&&(op<5));
        }while(op!=4);
    }
}
