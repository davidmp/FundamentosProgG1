package pe.edu.upeu.app;

import java.util.Scanner;

import pe.edu.upeu.arreglos.ArreglosPractica;
import pe.edu.upeu.utils.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App {

   static Scanner leer=new Scanner(System.in);
    public static void main( String[] args ){
        LeerTeclado teclado=new LeerTeclado();
        System.out.println( "Sistema de Pruebas *****" );        
        String opcion="SI";
        int numAlg;
        String algoritmosNombres=
          "1=GUI Fibonaci Conejos\n"+
          "2=Cuadrado de 100 primeros numeros\n"+
          "3=SumaElemtoVector MediaAritmetica\n"+
          "4=Contabiliza Elementos Vector (ceros, positivos, negativos)";
          ArreglosPractica obj;
          int[] vector;
        do{
          System.out.println(algoritmosNombres);          
          numAlg=teclado.leer(0,"Ingrese el Algoritmo que desea probar: ");
          switch(numAlg){
            case 1:         
            new MainGUI();
            break;
            case 2:         
            obj=new ArreglosPractica();
            obj.imprimirContenidoVector(obj.calcularNumAlCuadrado());
            break;
            case 3:         
            obj=new ArreglosPractica();
             vector=obj.ingresarDatosVector(teclado.leer(0, "Ingrese el Tamanho del Vector"), "aleatorio");
            obj.imprimirContenidoVector(vector);
            obj.sumaElemMediaAritVector(vector);
            //obj.imprimirContenidoVector();
            break;    
            case 4:         
            obj=new ArreglosPractica();
            vector=obj.ingresarDatosVector(teclado.leer(0, "Ingrese el Tamanho del Vector"), "aleatorio");
            obj.imprimirContenidoVector(vector);
            obj.contabilizarCerosPostvoNegtElemVector(vector);
            
            break;                     
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }          
          opcion=teclado.leer("","Desea probar mas algoritmos? SI/NO");  
        }while(opcion.equals("SI"));  
    }
}
