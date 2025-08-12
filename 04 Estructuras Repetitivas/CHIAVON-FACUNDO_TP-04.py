# 1) Crea un programa que imprima en pantalla todos los números enteros desde 0 hasta 100
# (incluyendo ambos extremos), en orden creciente, mostrando un número por línea.

for i in range(0,101):
    print(i)

# 2) Desarrolla un programa que solicite al usuario un número entero y determine la cantidad de
# dígitos que contiene.

numero=(input("Ingrese un numero entero: "))
digitos=len(numero)
print(f"el numero {numero} tiene {digitos} digitos")

# 3) Escribe un programa que sume todos los números enteros comprendidos entre dos valores
# dados por el usuario, excluyendo esos dos valores.

valor1=int(input("Ingrese el primer valor: "))
valor2=int(input("Ingrese el segundo valor: "))
suma=0

if valor1 > valor2:
    aux=valor1
    valor1=valor2
    valor2=aux

for i in range(valor1+1,valor2):
        suma += i

print(suma)

# 4) Elabora un programa que permita al usuario ingresar números enteros y los sume en
# secuencia. El programa debe detenerse y mostrar el total acumulado cuando el usuario ingrese
# un 0.

total=0
numero=int(input("Ingrese un número entero a sumar: "))

while numero !=0:
    total+=numero
    numero=int(input("Ingrese otro número entero a sumar: "))

print(f"El total sumado fue {total}")

# 5) Crea un juego en el que el usuario deba adivinar un número aleatorio entre 0 y 9. Al final, el
# programa debe mostrar cuántos intentos fueron necesarios para acertar el número.

import random

contador=1
numero_aleatoreo=random.randrange(0,9)
numero_usuario=int(input("Adivine que número es: "))

while numero_aleatoreo != numero_usuario:
    numero_usuario=int(input("Nop.. Intente otra vez: "))
    contador +=1

print(f"Adivinaste!!! y solo te tomó {contador} intentos!")

# 6) Desarrolla un programa que imprima en pantalla todos los números pares comprendidos
# entre 0 y 100, en orden decreciente.

for i in range(98,0,-2):
    print(i)


# 7) Crea un programa que calcule la suma de todos los números comprendidos entre 0 y un
# número entero positivo indicado por el usuario.

numero=int(input("Ingrese un valor entero positivo: "))
suma=0

for i in range(1,numero):
    suma+=i

print(suma)


# 8) Escribe un programa que permita al usuario ingresar 100 números enteros. Luego, el
# programa debe indicar cuántos de estos números son pares, cuántos son impares, cuántos son
# negativos y cuántos son positivos. (Nota: para probar el programa puedes usar una cantidad
# menor, pero debe estar preparado para procesar 100 números con un solo cambio).

positivo=0
negativo=0
par=0
impar=0

for i in range(0,100):
    numero=int(input("Ingrese un número entero: "))
    if numero >= 0:
        positivo+=1
    else:
        negativo+=1
    
    if numero%2==0:
        par+=1
    else:
        impar+=1

print(f"Ingresaste {positivo} números positivos y {negativo} negativos. De estos, {par} son pares y {impar} son impares")



# 9) Elabora un programa que permita al usuario ingresar 100 números enteros y luego calcule la
# media de esos valores. (Nota: puedes probar el programa con una cantidad menor, pero debe
# poder procesar 100 números cambiando solo un valor).

from statistics import mean

valores = [int(input("Ingresa un número entero: ")) for i in range(0,100)]
print(f"La media de los valores ingresados es {mean(valores)}")


# 10) Escribe un programa que invierta el orden de los dígitos de un número ingresado por el
# usuario. Ejemplo: si el usuario ingresa 547, el programa debe mostrar 745.

numero=input("Ingrese un valor positivo: ")
invertido=""

for i in range(len(numero)-1,-1,-1):
    invertido += numero[i]

print(invertido)