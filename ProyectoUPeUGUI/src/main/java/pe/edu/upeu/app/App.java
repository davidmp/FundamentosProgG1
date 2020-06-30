package pe.edu.upeu.app;

import java.util.Scanner;

import pe.edu.upeu.arreglos.ArreglosPractica;

/**
 * Hello world!
 *
 */
public class App {

   static Scanner leer=new Scanner(System.in);
    public static void main( String[] args ){
        System.out.println( "Sistema de Pruebas *****" );        
        String opcion="SI";
        int numAlg;
        String algoritmosNombres=
          "1=GUI Fibonaci Conejos\n"+
          "2=Cuadrado de 100 primeros numeros\n"+
          "3=xxxxx\n"+
          "4=xxxxx";

        do{
          System.out.println(algoritmosNombres);
          System.out.println("Ingrese el Algoritmo que desea probar: ");
          numAlg=leer.nextInt();
          switch(numAlg){
            case 1:         
            new MainGUI();
            break;
            case 2:         
            ArreglosPractica obj=new ArreglosPractica();
            obj.imprimirContenidoVector(obj.calcularNumAlCuadrado());
            break;
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }
          System.out.println("Desea probar mas algoritmos? SI/NO ");
          opcion=leer.next();    
        }while(opcion.equals("SI"));  
    }
}
