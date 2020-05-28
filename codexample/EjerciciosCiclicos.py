class EjerciciCiclico:
    def calcularFactorialNNum(self):        
        factorial=1
        numero=int(input("Ingrese el factorial un Numero:"))
        while(numero!=0):
            factorial=factorial*numero
            numero=numero-1
        print(f"El factorial es: {factorial}")

obj=EjerciciCiclico()
obj.calcularFactorialNNum()