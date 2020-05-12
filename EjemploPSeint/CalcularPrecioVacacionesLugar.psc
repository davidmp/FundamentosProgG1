Algoritmo CalcularPrecioTotalVacaciones
	Definir lugar como cadena
	Definir costoxK, costoTotal, totalKilometro como real
	//Datos de Entrada
	Escribir "Ingrese el Lugar en donde sesea pasar Vacaciones:"
	Leer lugar
	Escribir "Ingrese el costo por Kilometro:"
	Leer costoxK
	//Proceso
	segun (Minusculas(lugar)) hacer
		"mexico" o "méxico": totalKilometro<-2*750
		"PV": totalKilometro<-2*800
		"AC": totalKilometro<-2*1200
		"CA": totalKilometro<-2*1800
		De Otro Modo:
			totalKilometro<-2*0
			Escribir "Se queda en Casa"
	FinSegun
	costoTotal<-(totalKilometro*costoxK)	
	//Datos de salida
	Escribir "El costo total de sus vaciones sera: ", costoTotal
	Escribir "Pasara sus vaciones en: ", lugar
FinAlgoritmo
