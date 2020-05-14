#include <iostream>

void suma10Valores(){
  int contador=1;
  float suma_numeros=0, valor_numero;
  //Datos de Entrada y Proceso
  while (contador<=10){
      printf("Ingrese el valor numerico de la posicion %i:",contador);
      scanf("%f",&valor_numero);
        suma_numeros=suma_numeros+valor_numero;
      contador++; //contador=contador+1 //contador+=1
  }
  printf("La suma de los 10 números ingresados es:%.2lf",suma_numeros);
}

int main(){    
    printf("Hola mundo...\n");
    suma10Valores();
    return 0;
}