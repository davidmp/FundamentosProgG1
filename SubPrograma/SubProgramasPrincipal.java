
import upeu.edu.pe.EjerciciosJava;
import upeu.edu.pe.util.LeerTeclado;
public class SubProgramasPrincipal{
    //javac -d build/ upeu\LeerTeclado.java SubProgramasPrincipal.java
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
        do{

          numAlg=teclado.leer(0, "Ingrese el Algoritmo que desea probar: ");
          switch(numAlg){
            case 1:         
            int a=teclado.leer(0, "Ingrese el Numero Inicial:");
            int b=teclado.leer(0, "Ingrese el Numero Final:");        
            obj.factorialEntreRangoNumeros(a, b);   
            break;
            case 2:   break;
            case 3:   break;
            case 4:   break;
            default: System.out.println("Num de Algoritmo no existe!!"); break;
          }

          opcion=teclado.leer("", "Desea probar mas algoritmos? SI/NO");
    
        }while(opcion.equals("SI"));        

    }
}