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

 //Ejercico 4.11
  public static long retornarFactorialNumero(int numero){
    long factorial=1;
    while(numero!= 0) {
        factorial=(Long)factorial*numero;             
        numero--;//numero=numero-3; numero-= 2
    }   
    return factorial;
  } 
  public static void funcionExponencial(){    
    System.out.print("Ingrese el numero:");
    double resultado=1;
    int numero=input.nextInt(); 
    for(int numx=1;numx<=numero; numx++){
      resultado=resultado+(Math.pow(numero,numx))/retornarFactorialNumero(numx);
      }
      System.out.println("El resultado de la Fun. Exp es:"+resultado); 
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

//ejercicio 4.9
public static void calcularInversionCAhorro(){
  double xCantidad, ganacia=0, inversionTotal=0;
  int cantidadA=1;
  String continarInv="SI";
  do{
    System.out.println("Año "+cantidadA);
    System.out.println("Ingrese el monto a invertir cada mes:");
    xCantidad=input.nextDouble();
    inversionTotal+=(xCantidad*12);
    System.out.println("La inversion de año "+cantidadA+" es:"+inversionTotal);
    ganacia=inversionTotal*0.1;
    inversionTotal+=ganacia;
    System.out.println("Desea seguir inveriendo?");
    continarInv=input.next();
    cantidadA++;
  }while(continarInv.toUpperCase().equals("SI"));
  System.out.println("El monto Total de capital que tine al final de los años es:"+(inversionTotal+ganacia));
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
        case 3: funcionExponencial();   break;
        case 4: calcularInversionCAhorro();   break;
        default: System.out.println("Num de Algoritmo no existe!!"); break;
      }
      System.out.println("Desea probar mas algoritmos? SI/NO");
      opcion=input.next();

    }while(opcion.equals("SI"));

  }

}