package pe.edu.upeu.arreglos;

public class ArreglosPractica {
    

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

}