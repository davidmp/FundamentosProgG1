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
                vector[indice]=(int)Math.round(Math.random()*100);
            }            
        }else{
            for(int indice=0; indice<vector.length;indice++){
                vector[indice]=teclado.leer(0, "Ingrese el valor en la posicion "+indice+":");
            }
        }        
        return vector;
    }

}