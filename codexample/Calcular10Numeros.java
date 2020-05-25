

import java.util.Scanner;

class Calcular10Numeros{
  
static Scanner sc=new Scanner(System.in);

  static void suma10NumerosRepiteMiestras(){
    int contador=1;
    double suma_numeros=0, valor_numero;
  //Datos de Entrada y Proceso
    do{
        System.out.println("Ingrese el valor numerico de la posicion :"+contador);
        valor_numero=sc.nextDouble();
        suma_numeros=suma_numeros+valor_numero;
        contador++; //contador=contador+1 //contador+=1
    }while(contador<=10);

  System.out.println("La suma de los 10 números ingresados es:"+suma_numeros);

  }

 	public static void main(String args[]){
     suma10NumerosRepiteMiestras();
   }

}