package upeu.edu.pe.ejercicios;

import java.math.BigInteger;

public class EjerciciosJava {
   
    public long retornarFactorialNumero(long factorial, int numero){
        factorial=1;
        while(numero!= 0) {
            factorial=(Long)factorial*numero;             
            numero--;//numero=numero-3; numero-= 2
        }   
        return factorial;
      }

    public BigInteger retornarFactorialNumero(BigInteger factorial,int numero){
      factorial=new BigInteger("1");
      while(numero!= 0) {
          factorial=factorial.multiply(BigInteger.valueOf(numero)); 
          numero--;//numero=numero-3; numero-= 2
      }   
      return factorial;
    }

    public BigInteger retornarFactorialNumeroRecur(int numero){
      BigInteger factorial=new BigInteger("1");
      if(numero>0) {
          return (BigInteger.valueOf(numero)).multiply(retornarFactorialNumeroRecur(numero-1)); 
          //numero--;//numero=numero-3; numero-= 2
      }   
      return factorial;
    }    
      
    public long fibonaciRecur(int numero){
      if(numero<2){
        return numero;        
      }else{
        System.out.println("f(n-1):"+(numero-1)+" f(n-2):"+(numero-2));
        return fibonaciRecur(numero-1)+fibonaciRecur(numero-2);
      }      
    }
      //6.2
      public void factorialEntreRangoNumeros(int numInit, int numFinal){
        for(int numero=numInit; numero<numFinal;numero++){
            BigInteger resultado=retornarFactorialNumero(BigInteger.valueOf(0), numero);
            System.out.println("El Factorial de "+numero+" es:"+resultado);
        }
      }


}