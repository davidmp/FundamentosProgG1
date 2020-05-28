import math
class EjerciciCiclico:
    def calcularFactorialNNum(self):        
        factorial=1
        numero=int(input("Ingrese el factorial un Numero:"))
        while(numero!=0):
            factorial=factorial*numero
            numero=numero-1
        print(f"El factorial es: {factorial}")
    
    def calcularMediaGeoArit(self):
        mediaArit=0
        mediaGeo=1
        cantNumeros=int(input("Ingrese la cantidad de numeros para la operacion:"))
        for contador in range(1,cantNumeros+1):
            numeroLeido=int(input(f"Ingrese el valor de la posicion {contador} :"))
            mediaGeo=mediaGeo*numeroLeido
            mediaArit=mediaArit+numeroLeido
        mediaGeo=math.sqrt(mediaGeo)
        mediaArit=mediaArit/cantNumeros
        if(mediaGeo<mediaArit):
            print(f"El valor Geometrico es Menor, con el valor de: {mediaGeo}")
        else:
            print(f"El valor Aritmetico es Menor, con el valor de: {mediaArit}")

obj=EjerciciCiclico()
#obj.calcularFactorialNNum()
obj.calcularMediaGeoArit()