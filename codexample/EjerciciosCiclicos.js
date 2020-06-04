class EjerciciosCiclicos{
    valorNumero;
    
    calcularTiposNumeros(){
        //Datos de Entrada	
        var ceros=0, menorCeros=0, mayoresCero=0, contador;
        var nCantidad=prompt("Introducir la cantidad de nuemros que desea leer:");
        //Proceso
        for(contador=1; contador<=nCantidad;contador++){
            this.valorNumero=prompt("Ingrese el valor de la posicion "+contador+":");
            if(this.valorNumero<0){
                menorCeros=menorCeros+1;
            }else if(this.valorNumero==0){
                ceros=ceros+1
            }else{
            mayoresCero=mayoresCero+1;
            }	
        }
        console.log("La cantidad de numeros menores a 0 es:"+menorCeros);
        console.log("La cantidad de numeros igual a 0 es:"+ceros);
        console.log("La cantidad de numeros mayores de 0 es:"+mayoresCero);
        
    }
}

obj = new EjerciciosCiclicos();
obj.calcularTiposNumeros();