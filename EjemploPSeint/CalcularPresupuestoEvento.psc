Algoritmo calcularPrecioTotalEvento
	Definir cantidadPersona Como Entero
	Definir presupuestoTotal Como Real
	// Datos de entrada 
	Escribir 'Ingrese la Cantidad de Personas:'
	Leer cantidadPersona
	// Proceso 
	Si cantidadPersona<=200 Entonces
		presupuestoTotal <- cantidadPersona*95
	SiNo
		Si cantidadPersona>200 Y cantidadPersona<=300 Entonces
			presupuestoTotal <- cantidadPersona*85
		SiNo
			presupuestoTotal <- cantidadPersona*75
		FinSi
	FinSi
	// Datos de Salida 
	Escribir 'El presupuesto total es: $ ',presupuestoTotal,' Dolares'
FinAlgoritmo
