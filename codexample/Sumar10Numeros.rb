
  suma_numeros=0
  #nombre="David"
  #Datos de Entrada y Proceso
  for contador in  1..10
    puts "Ingrese el valor numerico de la posicion #{contador}"   
    valor_numero=gets.to_f
    suma_numeros=suma_numeros+valor_numero
  end
  #Datos de Salida
  puts "La suma de los 10 números ingresados es:", suma_numeros