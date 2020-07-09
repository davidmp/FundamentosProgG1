package pe.edu.upeu.app;

import java.util.Scanner;

import pe.edu.upeu.arreglos.ArreglosPractica;
import pe.edu.upeu.dao.AppCrud;
import pe.edu.upeu.modelo.Clientes;
import pe.edu.upeu.utils.LeerArchivo;
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
          "4=Contabiliza Elementos Vector (ceros, positivos, negativos)\n"+
          "5=Ejemplo Matrices\n"+
          "6=Matriz Identidad";
          ArreglosPractica obj;
          AppCrud crudObj;
          LeerArchivo archObj;
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
            case 5:{
              int[][] matriz=new int[2][2];
              matriz[0][0]=1;
              matriz[0][1]=0;
              matriz[1][0]=0;
              matriz[1][1]=1;
              
              for(int indiceF=0;indiceF<matriz.length;indiceF++){
                  for(int indiceC=0;indiceC<matriz[0].length;indiceC++){
                    System.out.print(matriz[indiceF][indiceC]+"\t");
                  }
                  System.out.println("");
              }

            } break; 
            case 6: obj=new ArreglosPractica();   
                    obj.imprimeMatriz(obj.matrizIdentidad(teclado.leer(0, "Ingrese la Dimension de la matriz:")));
            break;
            case 7:
            crudObj=new AppCrud();
            archObj=new LeerArchivo("Clientes.txt");
            Clientes clienteTO=new Clientes();
            clienteTO.setDniId(teclado.leer("", "Ingrese el dni:"));
            clienteTO.setNombreApellidos(teclado.leer("","Ingrese el nombre completo:"));
            clienteTO.setNumTelf(teclado.leer("","Ingrese el numero de celular:"));
            clienteTO.setDireccion(teclado.leer("","Ingrese la direccion donde vive:"));
            crudObj.crearContenido(archObj, clienteTO);
            crudObj.imprimirLista(crudObj.listarContenido(archObj));
            
            break;
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }          
          opcion=teclado.leer("","Desea probar mas algoritmos? SI/NO");  
        }while(opcion.equals("SI"));  
    }
}
