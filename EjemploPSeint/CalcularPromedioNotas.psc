//Calcular el Promedio de Notas
Algoritmo CalcularPromedio
	//Datos de Entrada y definicion de variables
	Definir nota1, nota2,nota3, nota4 Como Real
	Definir sumaN, promN Como Real
	Escribir  "Nota 1:"
	Leer nota1
	Escribir  "Nota 2:"
	Leer nota2
	Escribir  "Nota 3:"
	Leer nota3
	Escribir  "Nota 4:"
	Leer nota4
	//Proceso
	sumaN<-(nota1+nota2+nota3+nota4)
	promN<-redon((sumaN)/4)
	//Datos de Salida
	Escribir "La nota promedio es:",promN
FinAlgoritmo
