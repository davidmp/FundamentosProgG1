import java.util.Scanner;
import java.math.BigInteger;

class EjerciciosCiclicos{
  static Scanner input= new Scanner(System.in);

  public static void calcularFactorialNNum(){
    BigInteger factorial = BigInteger.valueOf(1);
   
    int numero;
    System.out.print("Ingrese el factorial un Numero:");
    numero=input.nextInt();
    while(numero!= 0) {
        //factorial=(Long)factorial*numero;
        factorial=factorial.multiply(BigInteger.valueOf(numero));        
        numero--;//numero=numero-3; numero-= 2
    }
    System.out.println("El factorial es: "+ factorial); 
  }

  public static void calcularMediaGeoArit(){
    int cantNumeros;
    double mediaArit=0, mediaGeo=1, sumTotalNum;
    System.out.print("Ingrese la cantidad de nuemros para la operacion:");
    cantNumeros=input.nextInt();
    for(int contador=1;contador<=cantNumeros;contador++){
      System.out.print("Ingrese el valor de la posicion "+contador+":");
      double numeroLeido=input.nextDouble();
      mediaGeo=mediaGeo*numeroLeido;
      mediaArit=mediaArit+numeroLeido;
    }
    mediaGeo=Math.sqrt(mediaGeo);
    mediaArit=mediaArit/cantNumeros;
    if(mediaGeo<mediaArit){
System.out.print("El valor Geometrico es Menor con el valor de:"+mediaGeo+":");
    }else{
System.out.print("El valor Aritmetico es Menor con el valor de:"+mediaArit+":");
    }

  }


  public static void main(String[] arg){     
    System.out.println("Probar Algoritmos: ");
    
    String opcion="SI";
    int numAlg;
    do{
      System.out.println("Ingrese el Algoritmo que desea probar: ");
      numAlg=input.nextInt();
      switch(numAlg){
        case 1: calcularFactorialNNum();   break;
        case 2: calcularMediaGeoArit();   break;
        case 3:    break;
        default: System.out.println("Num de Algoritmo no existe!!"); break;
      }
      System.out.println("Desea probar mas algoritmos? SI/NO");
      opcion=input.next();

    }while(opcion.equals("SI"));

  }

}