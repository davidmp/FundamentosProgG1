Algoritmo CalcularCostoTotalPoliza
	Definir costPA,costPB,presFPA, PresFPB, sumPorcAB como real//Definir Variables
	Definir Edad como Entero
	Definir PAh,PuL,PtE Como Caracter
	costPA<-1200 //Inicializar vsalores
	costPB<-950
	sumPorcAB<-0
	//Datos de entrada
	Escribir "Ingrese su edad:"
	Leer Edad
	Escribir "Toma Alcohol?:"
	Leer PAh
	Escribir "Usa Lentes:"
	Leer PuL
	Escribir "Tiene alguna Enfermedad:"
	Leer PtE	
	//Proceso  P=30  Alcohol=s Lentes=S, Enfermedad=S
	si Edad>40 Entonces
		sumPorcAB<-sumPorcAB+20
	SiNo
		sumPorcAB<-sumPorcAB+10
	FinSi
	
	si Mayusculas(PAh)=='S' Entonces
		sumPorcAB<-sumPorcAB+10
	FinSi
	
	si Mayusculas(PuL)=='S' Entonces
		sumPorcAB<-sumPorcAB+5
	FinSi

	si Mayusculas(PtE)=='S' Entonces
		sumPorcAB<-sumPorcAB+5
	FinSi	
	//Conversion
	sumPorcAB<-sumPorcAB/100  //0.30
	presFPA<-costPA+(costPA*sumPorcAB)
	PresFPB<-costPB+(costPB*sumPorcAB)
	//Datos de Salida
	Escribir "El costo total para el Plan A es: $", presFPA, "Dolares"
	Escribir "El costo total para el Plan B es: $", PresFPB, "Dolares"
		
FinAlgoritmo
