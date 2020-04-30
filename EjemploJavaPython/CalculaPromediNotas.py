#Calcular el Promedio de Notas
#Datos de Entrada
nota1=float(input("Nota 1:"))
nota2=float(input("Nota 2:"))
nota3=float(input("Nota 3:"))
nota4=float(input("Nota 4:"))
#Proceso
sumaN=(nota1+nota2+nota3+nota4)
promedioN=int(round((sumaN)/4,0))
#Datos de Salida
print("La nota Promedio es:",promedioN)