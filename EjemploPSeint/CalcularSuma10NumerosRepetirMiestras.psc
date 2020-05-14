Algoritmo suma10NumerosRepiteMientras	
	Definir contador Como Entero	
	Definir suma_numeros, valor_numero Como Real	
	contador<-1	
	suma_numeros<-0	
	//Datos de Entrada y Proceso	
	Repetir			
		Escribir "Ingrese el valor numerico de la posicion ",contador,":"		
		Leer valor_numero		
		suma_numeros<- suma_numeros+valor_numero		
		contador<- contador+1				
	Mientras Que contador<0	
	//Datos de Salida	
	Escribir  "La suma de los 10 números ingresados es:", suma_numeros	
FinAlgoritmo