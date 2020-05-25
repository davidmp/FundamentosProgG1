import java.util.Scanner;

public class CalcularHipotenusa{
  //Libreria para leer desde el teclado
 static Scanner sc=new Scanner(System.in);
public static void main(String[] arg){
  //Datos de Entrada
  int CaAd,CaOp;
  double Hi;
   System.out.println("Ingrese el Cateto Adyacente: ");
    CaAd=sc.nextInt();
   System.out.println("Ingrese el Cateto Opuesto:  ");
    CaOp=sc.nextInt();    
    //Proceso
    Hi=Math.sqrt(Math.pow(CaAd, 2)+Math.pow(CaOp, 2));
    //Datos de Salida
    System.out.println("La Himotenusa es:"+Hi);  
}
}