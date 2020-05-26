import java.util.Scanner;

class EjerciciosCiclicos{
  static Scanner input= new Scanner(System.in);

  public static void calcularFactorialNNum(){
    int factorial = 1;
    int numero;
    System.out.print("Ingrese el factorial un Numero:");
    numero=input.nextInt();
    while(numero!= 0) {
        factorial*=numero;
        numero--;//numero=numero-3; numero-= 2
    }
    System.out.println("El factorial es: "+ factorial); 
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
        case 2:    break;
        case 3:    break;
        default: System.out.println("Num de Algoritmo no existe!!"); break;
      }
      System.out.println("Desea probar mas algoritmos? SI/NO");
      opcion=input.next();

    }while(opcion.equals("SI"));

  }

}