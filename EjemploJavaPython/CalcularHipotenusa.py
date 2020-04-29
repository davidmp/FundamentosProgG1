import math
#Datos de entrada
CaAd = int(input("Ingrese el Cateto Adyacente: "))
CaOp = int(input("Ingrese el Cateto Opuesto: "))
#Proceso
Hi=math.sqrt(CaAd**2+CaOp**2)
#Datos de Salida
print("La hipotenusa es:",Hi)