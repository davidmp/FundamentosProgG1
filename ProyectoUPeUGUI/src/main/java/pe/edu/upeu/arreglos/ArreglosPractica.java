package pe.edu.upeu.arreglos;

import pe.edu.upeu.utils.LeerTeclado;

public class ArreglosPractica {
    
    LeerTeclado teclado=new LeerTeclado();

    public int[] calcularNumAlCuadrado(){
        int[] resultadoCuadrado=new int[100];
        for(int numInit=1; numInit<=100;numInit++){
            resultadoCuadrado[numInit-1]=(int)Math.pow(numInit, 2);
        }
        return resultadoCuadrado;
    }

    public void imprimirContenidoVector(int[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println("vector["+indice+"]="+vector[indice]);
        }
    }

    public void sumaElemMediaAritVector(int[] vector){
        double resultadoSE=0.0; double mediaArit=0.0;
        for(int indice=0;indice<vector.length;indice++){
            resultadoSE+=vector[indice];
        }
        mediaArit=(resultadoSE/(double)vector.length);
        System.out.println("La suma es:"+resultadoSE);
        System.out.println("La media Aritmetica es:"+mediaArit);
    }

    public int[] ingresarDatosVector(int thamano, String tipoLlenado){
        int[] vector=new int[thamano];
        if(tipoLlenado.toUpperCase().equals("ALEATORIO")){
            for(int indice=0; indice<vector.length;indice++){
                //vector[indice]=(int)Math.round(Math.random()*100);
                vector[indice]=generatRandoPostNegtValue(thamano, thamano);
            }            
        }else{
            for(int indice=0; indice<vector.length;indice++){
                vector[indice]=teclado.leer(0, "Ingrese el valor en la posicion "+indice+":");
            }
        }        
        return vector;
    }

    public void contabilizarCerosPostvoNegtElemVector(int[] vector){
        int contador=0;
        int cantCeros=0, cantNegativo=0, cantPositivo=0;
        while(contador<vector.length){
            if(vector[contador]<0){
                cantNegativo++;
            }else if(vector[contador]==0){
                cantCeros++;
            }else{
                cantPositivo++;
            }
            contador++;
        }
        System.out.println("La cantidad de Elementos Negaticos es:"+cantNegativo);
        System.out.println("La cantidad de Elementos Iguales a 0 son:"+cantCeros);
        System.out.println("La cantidad de Elementos positivos son:"+cantPositivo);
    }


    public int generatRandoPostNegtValue(int min,int max) {              
        int numero = -min + (int) (Math.random() * ((max - (-min)) + 1)); 
        return numero;
    }

    public int[][] matrizIdentidad(int dimension){
        int[][] matrizI=new int[dimension][dimension];
        for(int indiceF=0; indiceF<matrizI.length; indiceF++){
            for(int indiceC=0; indiceC<matrizI[0].length; indiceC++){
            if(indiceF==indiceC){
                matrizI[indiceF][indiceC]=1;
            }else{ 
                matrizI[indiceF][indiceC]=0;
            }
            }
        }
        return matrizI;
    }

    public void imprimeMatriz(int[][] matriz){
        for(int indiceF=0; indiceF<matriz.length; indiceF++){
            for(int indiceC=0; indiceC<matriz[0].length; indiceC++){
            System.out.print(matriz[indiceF][indiceC]+"\t");
            }
            System.out.println("");
        }        
    }


}