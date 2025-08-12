# 1. Crear una función llamada imprimir_hola_mundo que imprima por
# pantalla el mensaje: “Hola Mundo!”. Llamar a esta función desde el
# programa principal.

#Definicion de funciones
def imprimir_hola_mundo():
    print("Hola Mundo!")

#Programa principal
imprimir_hola_mundo()


# 2. Crear una función llamada saludar_usuario(nombre) que reciba
# como parámetro un nombre y devuelva un saludo personalizado.
# Por ejemplo, si se llama con saludar_usuario("Marcos"), deberá devolver: “Hola Marcos!”. Llamar a esta función desde el programa
# principal solicitando el nombre al usuario.

#Definicion de funciones
def saludar_usuario(nombre):
    print(f"Hola {nombre}!")

#Programa principal
saludar_usuario(input("Ingresa tu nombre: "))


# 3. Crear una función llamada informacion_personal(nombre, apellido,
# edad, residencia) que reciba cuatro parámetros e imprima: “Soy
# [nombre] [apellido], tengo [edad] años y vivo en [residencia]”. Pedir los datos al usuario y llamar a esta función con los valores ingresados.


#Definicion de funciones
def informacion_personal(nombre, apellido, edad, residencia):
    print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}")

#Programa principal
nombre=input("Ingrese su nombre: ")
apellido=input("Ingrese su apellido: ")
edad=int(input("Ingrese su edad: "))
residencia=input("Ingrese su residencia: ")

informacion_personal(nombre, apellido, edad, residencia)


# 4. Crear dos funciones: calcular_area_circulo(radio) que reciba el radio como parámetro y devuelva el área del círculo.
# calcular_perimetro_circulo(radio) que reciba el radio como parámetro y devuelva el perímetro del círculo. 
# Solicitar el radio al usuario y llamar ambas funciones para mostrar los resultados.

import math
#Definicion de funciones
def calcular_area_circulo(radio):
    area= math.pi * radio**2
    return area


def calcular_perimetro_circulo(radio):
    perimetro=math.pi * 2 * radio
    return perimetro

#Programa principal
radio=float(input("Ingrese el radio de la circunferencia: "))
area=calcular_area_circulo(radio)
perimetro=calcular_perimetro_circulo(radio)

print(f"El área de la circunferencia es {area:.2f} y su perímetro {perimetro:.2f}")


# 5. Crear una función llamada segundos_a_horas(segundos) que reciba
# una cantidad de segundos como parámetro y devuelva la cantidad
# de horas correspondientes. Solicitar al usuario los segundos y mostrar el resultado usando esta función.


#Definicion de funciones
def segundos_a_horas(segundos):
    horas=segundos/3600
    return horas

#Programa principal
segundos=int(input("Ingrese la cantidad de segundos: "))
horas=segundos_a_horas(segundos)

print(f"{segundos} segundos equivalen a {horas:.2f} horas")


# 6. Crear una función llamada tabla_multiplicar(numero) que reciba un
# número como parámetro y imprima la tabla de multiplicar de ese
# número del 1 al 10. Pedir al usuario el número y llamar a la función.


#Definicion de funciones
def tabla_multiplicar(numero):
    for i in range(1,11):
        print(f"{numero} x {i} = {i*numero}")

#Programa principal
numero=int(input("Ingrese un número entero: "))
tabla_multiplicar(numero)


# 7. Crear una función llamada operaciones_basicas(a, b) que reciba
# dos números como parámetros y devuelva una tupla con el resultado de sumarlos, restarlos, multiplicarlos y dividirlos. Mostrar los resultados de forma clara.


#Definicion de funciones
def operaciones_basicas(a, b):
    return (a+b, a-b, a*b, a/b)

#Programa principal
resultados=operaciones_basicas(2,6)
print(f"La suma da: {resultados[0]}")
print(f"La resta da: {resultados[1]}")
print(f"La multiplicación da: {resultados[2]}")
print(f"La división da: {resultados[3]:.2f}")


# 8. Crear una función llamada calcular_imc(peso, altura) que reciba el
# peso en kilogramos y la altura en metros, y devuelva el índice de
# masa corporal (IMC). Solicitar al usuario los datos y llamar a la función para mostrar el resultado con dos decimales.


#Definicion de funciones
def calcular_imc(peso, altura):
    print(f"Su IMC = {peso/altura**2:.2f}")


#Programa principal
altura=float(input("Ingrese su altura(mt): "))
peso = float(input("Ingrese su peso(Kg): "))
calcular_imc(peso, altura)



# 9. Crear una función llamada celsius_a_fahrenheit(celsius) que reciba
# una temperatura en grados Celsius y devuelva su equivalente en
# Fahrenheit. Pedir al usuario la temperatura en Celsius y mostrar el
# resultado usando la función.


#Definicion de funciones
def celsius_a_fahrenheit(celsius):
    print(f"{celsius}°C equivalen a {9/5*celsius+32}°F")
     

#Programa principal
celsius_a_fahrenheit(float(input("Ingrese la temperatura (°C): ")))



# 10.Crear una función llamada calcular_promedio(a, b, c) que reciba
# tres números como parámetros y devuelva el promedio de ellos.
# Solicitar los números al usuario y mostrar el resultado usando esta
# función.


#Definicion de funciones
def calcular_promedio(a, b, c):
    promedio=(a+b+c)/3
    print(f"El promedio es {promedio}")

#Programa principal
n1=int(input("Ingrese el 1er valor: "))
n2=int(input("Ingrese el 2do valor: "))
n3=int(input("Ingrese el 3er valor: "))
calcular_promedio(n1,n2,n3)