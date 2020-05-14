Algoritmo suma10NumerosPara
	Definir suma_numeros, valor_numero Como Real		
	suma_numeros<-0	
	//Datos de Entrada y Proceso	
	Para contador <- 1	Hasta 10 Con Paso 1 Hacer		
		Escribir "Ingrese el valor numerico de la posicion ",contador,":"		
		Leer valor_numero		
		suma_numeros<- suma_numeros+valor_numero						
	FinPara	
	//Datos de Salida	
	Escribir  "La suma de los 10 números ingresados es:", suma_numeros		
	
FinAlgoritmo
