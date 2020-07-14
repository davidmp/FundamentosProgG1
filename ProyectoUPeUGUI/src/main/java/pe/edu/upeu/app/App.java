package pe.edu.upeu.app;

import java.util.Scanner;

import pe.edu.upeu.arreglos.ArreglosPractica;
import pe.edu.upeu.dao.AppCrud;
import pe.edu.upeu.modelo.Clientes;
import pe.edu.upeu.modelo.Productos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App {
  static LeerTeclado teclado=new LeerTeclado();
  static AppCrud crudObj;
  static LeerArchivo archObj;

  static Scanner leer=new Scanner(System.in);

  public final static void clearConsole(){
    try{            
        final String os = System.getProperty("os.name");    
        if (os.contains("Windows")){
           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }else{
            new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
        }
    }
    catch (final Exception e){
       System.out.println("Error: "+e.getMessage());
    }
}

  public static Object[][] crearCliente(){    
    crudObj=new AppCrud();
    archObj=new LeerArchivo("Clientes.txt");
    Clientes clienteTO=new Clientes();
    clienteTO.setDniId(teclado.leer("", "Ingrese el dni:"));
    clienteTO.setNombreApellidos(teclado.leer("","Ingrese el nombre completo:"));
    clienteTO.setNumTelf(teclado.leer("","Ingrese el numero de celular:"));
    clienteTO.setDireccion(teclado.leer("","Ingrese la direccion donde vive:"));   
    clearConsole();     
    return crudObj.agregarContenido(archObj, clienteTO);
  }

  public static Object[][] crearProducto(){
    crudObj=new AppCrud();
    archObj=new LeerArchivo("Productos.txt");
    Productos prodTO=new Productos();
    prodTO.setProductoId(teclado.leer("", "Ingrese el codigo de Tipo de Productos:"));
    prodTO.setNombreProd(teclado.leer("", "Ingrese del nombre de tipo de Producto:"));    
    return crudObj.agregarContenido(archObj, prodTO);
  }

    public static void main( String[] args ){
        teclado=new LeerTeclado();
        System.out.println( "Sistema de Pruebas *****" );        
        String opcion="SI";
        int numAlg;
        String algoritmosNombres=
          "1=GUI Fibonaci Conejos\n"+
          "2=Cuadrado de 100 primeros numeros\n"+
          "3=SumaElemtoVector MediaAritmetica\n"+
          "4=Contabiliza Elementos Vector (ceros, positivos, negativos)\n"+
          "5=Ejemplo Matrices\n"+
          "6=Matriz Identidad\n"+
          "7=Crear Cliente\n"+
          "8=Listar cliente\n"+
          "9=Crear Productos";
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
            case 6: 
            clearConsole();
                    obj=new ArreglosPractica();   
                    obj.imprimeMatriz(obj.matrizIdentidad(teclado.leer(0, "Ingrese la Dimension de la matriz:")));
            break;
            case 7:
            clearConsole();
            crudObj=new AppCrud();
            crudObj.imprimirLista(crearCliente());
            break;
            case 8:
            clearConsole();
            crudObj=new AppCrud();
            archObj=new LeerArchivo("Clientes.txt");
            crudObj.imprimirLista(crudObj.listarContenido(archObj));
            break;
            case 9:
            clearConsole();
            crudObj=new AppCrud();
            crudObj.imprimirLista(crearProducto());  

            break;
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }          
          opcion=teclado.leer("","Desea probar mas algoritmos? SI/NO");  
        }while(opcion.equals("SI"));  
    }
}
