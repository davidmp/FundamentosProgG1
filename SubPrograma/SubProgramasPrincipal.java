
import upeu.edu.pe.EjerciciosJava;
import upeu.edu.pe.util.LeerTeclado;
public class SubProgramasPrincipal{
    //javac -d build/ upeu\LeerTeclado.java SubProgramasPrincipal.java
    //javac -d build/ upeu\*.java *.java
    //cd build
    //java -cp . SubProgramasPrincipal
    public static void main(String[] args) {
        LeerTeclado teclado=new LeerTeclado();
        System.out.println("Saludos");
       /* int a=teclado.leer(0, "Ingrese el Primer Valor");
        int b=teclado.leer(0, "Ingrese el Segundo Valor Valor");
        System.out.println("El Resultado de la Suma es:"+(a+b));*/

        EjerciciosJava obj=new EjerciciosJava();
        int a=teclado.leer(0, "Ingrese el Numero Inicial:");
        int b=teclado.leer(0, "Ingrese el Numero Final:");        
        obj.factorialEntreRangoNumeros(a, b);

    }
}