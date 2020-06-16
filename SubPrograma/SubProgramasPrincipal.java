
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
    public static void main(String[] args) {
        LeerTeclado teclado=new LeerTeclado();
        EjerciciosJava obj=new EjerciciosJava();
        String opcion="SI";
        int numAlg;
        int numero;
        do{
          System.out.println("1=Calcular Factorial entre rango de numeros\n2=Factorial Recursivo\n3=Fibonaci");
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
            case 4:   break;
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }

          opcion=teclado.leer("", "Desea probar mas algoritmos? SI/NO");
    
        }while(opcion.equals("SI"));        

    }
}