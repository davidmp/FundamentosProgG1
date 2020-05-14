contador=1
suma_numeros=0
#nombre="David"
#Datos de Entrada y Proceso
while contador<=10:
  valor_numero=float(input(f"Ingrese el valor numerico de la posicion {contador}:"))
  suma_numeros=suma_numeros+valor_numero
  contador=contador+1
#Datos de Salida
print(f"La suma de los 10 números ingresados es:{suma_numeros}")

#print("Prueba:",suma_numeros,"-",contador,"-",nombre)
#print("Prueba:"+nombre+ " Mamani")