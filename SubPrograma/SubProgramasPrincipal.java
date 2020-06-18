
import upeu.edu.pe.ejercicios.*;
import upeu.edu.pe.util.LeerTeclado;
public class SubProgramasPrincipal{
    //javac -d build/ upeu\LeerTeclado.java SubProgramasPrincipal.java
    // javac -d build/ upeu\edu\pe\ util\*.java upeu\edu\pe\ejercicios\*.java *.java
    //javac -d build/ upeu\*.java *.java
    //cd build
    //java -cp . SubProgramasPrincipal
    //Empaquetado
    //jar cvfm Programa.jar manifest.mf upeu/edu/pe/util/*.class upeu/edu/pe/*.class *.class

    public static void ejemploVectores(){
      String[] nombres;

      String[] nombresX={
        "Burgos Pari Diego Armando", 
        "Callata Amones Michael Jordan",
        "Carlos Yucra Wily Abrahan",
        "Checco Kana Edgar",
        "Coila Uscamayta Jhon Ubaldo",
        "Diaz Puraca Cesar Edmundo",
        "Garcia Condorchoa Jose Manuel",
        "Gutierrez Ccari Luis Felipe",
        "Lazarte Infa Manuel",
        "Ruelas Canaza Cristhian Efrain",
        "Sucasaire Mamani Jhon Erick",
        "Vilca Mamani Jheyson Wily",
        "Ytucayasi Savina Saul David"
      };

      
      int[] notas={0,6,8,9,12,9,0,14,14,0,8,20,17,20,20,18,20,0,13,19};
      double promedio=0;
      for(int i=0;i<notas.length;i++){ 
        if(notas[i]==0) notas[i]=5; 
        promedio+=notas[i]; 
        System.out.print(notas[i]+" | ");
      }    
      System.out.println("\nEl Promedio es:"+(promedio/notas.length));


      System.out.println("Tamanho:"+nombresX.length);

      for(int i=0; i<nombresX.length;i++){
        System.out.println("Estudiante "+(i+1)+":"+nombresX[i]);
    }


    String[] nombresXX=new String[13];
    nombresXX[0]="Burgos Pari Diego Armand";
    nombresXX[1]="Callata Amones Michael Jordan";
    nombresXX[12]="Ytucayasi Savina Saul David";

    }


    public static void main(String[] args) {
        LeerTeclado teclado=new LeerTeclado();
        EjerciciosJava obj=new EjerciciosJava();
        String opcion="SI";
        int numAlg;
        int numero;
        String algoritmosNombres=
          "1=Calcular Factorial entre rango de numeros\n"+
          "2=Factorial Recursivo\n"+
          "3=Fibonaci\n"+
          "4=Vectores";

        do{
          System.out.println(algoritmosNombres);
          numAlg=teclado.leer(0, "Ingrese el Algoritmo que desea probar: ");
          switch(numAlg){
            case 1:         
            int a=teclado.leer(0, "Ingrese el Numero Inicial:");
            int b=teclado.leer(0, "Ingrese el Numero Final:");        
            obj.factorialEntreRangoNumeros(a, b);   
            break;
            case 2: 
            numero=teclado.leer(0, "Ingrese el Numero para calcular el Factorial:");
            System.out.println("Resultado:"+obj.retornarFactorialNumeroRecur(numero));
            break;
            case 3:
            numero=teclado.leer(0, "Ingrese el Numero para calcular la serie de Fibonaci:");
            System.out.println("Resultado:"+obj.fibonaciRecur(numero));            
            break;
            case 4: ejemploVectores();  break;
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }

          opcion=teclado.leer("", "Desea probar mas algoritmos? SI/NO");
    
        }while(opcion.equals("SI"));        

    }
}