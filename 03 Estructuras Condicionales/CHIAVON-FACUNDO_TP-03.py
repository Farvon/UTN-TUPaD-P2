# 1) Escribir un programa que solicite la edad del usuario. Si el usuario es mayor de 18 años,
# deberá mostrar un mensaje en pantalla que diga “Es mayor de edad”.

edad=int(input("Ingrese su edad: "))
if edad >= 18:
    print("Es mayor de edad")


# 2) Escribir un programa que solicite su nota al usuario. Si la nota es mayor o igual a 6, deberá
# mostrar por pantalla un mensaje que diga “Aprobado”; en caso contrario deberá mostrar el
# mensaje “Desaprobado”.

nota=int(input("Ingrese su nota: "))
if nota >= 6:
    print("Aprobado")
else:
    print("Desaprobado")


# 3) Escribir un programa que permita ingresar solo números pares. Si el usuario ingresa un
# número par, imprimir por en pantalla el mensaje "Ha ingresado un número par"; en caso
# contrario, imprimir por pantalla "Por favor, ingrese un número par". Nota: investigar el uso del
# operador de módulo (%) en Python para evaluar si un número es par o impar.


print("Ha ingresado un numero par") if int(input("Ingrese un numero: "))%2==0 else print("Por favor, ingrese un numero par")


# 4) Escribir un programa que solicite al usuario su edad e imprima por pantalla a cuál de las
# siguientes categorías pertenece:
# ● Niño/a: menor de 12 años.
# ● Adolescente: mayor o igual que 12 años y menor que 18 años.
# ● Adulto/a joven: mayor o igual que 18 años y menor que 30 años.
# ● Adulto/a: mayor o igual que 30 años.

edad=int(input("Ingrese su edad: "))
if edad < 12:
    print("Eres un Niño/a")
elif 12 <= edad <18:
    print("Eres un Adolescente")
elif 18 <= edad < 30:
    print("Eres un Adulto/a joven")
else:
    print("Eres un Adulto/a")


# 5) Escribir un programa que permita introducir contraseñas de entre 8 y 14 caracteres
# (incluyendo 8 y 14). Si el usuario ingresa una contraseña de longitud adecuada, imprimir por en
# pantalla el mensaje "Ha ingresado una contraseña correcta"; en caso contrario, imprimir por
# pantalla "Por favor, ingrese una contraseña de entre 8 y 14 caracteres". Nota: investigue el uso
# de la función len() en Python para evaluar la cantidad de elementos que tiene un iterable tal
# como una lista o un string.


print("Ha ingresado una contraseña correcta") if 8<= len(input("Ingrese una contraseña de 8 a 14 caracteres: "))<= 14 else print("Por favor, ingrese una contraseña de entre 8 y 14 caracteres")


# 6) El paquete statistics de python contiene funciones que permiten tomar una lista de números
# y calcular la moda, la mediana y la media de dichos números. 
# La moda (mode), la mediana (median) y la media (mean) son parámetros estadísticos que se
# pueden utilizar para predecir la forma de una distribución normal a partir del siguiente criterio:
# ● Sesgo positivo o a la derecha: cuando la media es mayor que la mediana y, a su vez, la
# mediana es mayor que la moda.
# ● Sesgo negativo o a la izquierda: cuando la media es menor que la mediana y, a su vez,
# la mediana es menor que la moda.
# ● Sin sesgo: cuando la media, la mediana y la moda son iguales.

# Teniendo en cuenta lo antes mencionado, escribir un programa que tome la lista
# numeros_aleatorios, calcule su moda, su mediana y su media y las compare para determinar si
# hay sesgo positivo, negativo o no hay sesgo. Imprimir el resultado por pantalla.


from statistics import mode,median,mean
import random
numeros_aleatorios = [random.randint(1, 100) for i in range(50)]

moda=mode(numeros_aleatorios)
mediana=median(numeros_aleatorios)
media=mean(numeros_aleatorios)

if moda < mediana < media :
    print("Hay sesgo positivo")
    print(f"Moda: {moda} -- Mediana: {mediana} -- Media: {media}")
elif media < mediana < moda : 
    print("Hay sesgo negativo")
    print(f"Moda: {moda} -- Mediana: {mediana} -- Media: {media}")
elif media == mediana == moda :
    print("Sin sesgo")
    print(f"Moda: {moda} -- Mediana: {mediana} -- Media: {media}")
else:
    print("No se dieron las condiciones necesarias para determinar el sesgo")
    print(f"Moda: {moda} -- Mediana: {mediana} -- Media: {media}")
 


# 7) Escribir un programa que solicite una frase o palabra al usuario. Si el string ingresado
# termina con vocal, añadir un signo de exclamación al final e imprimir el string resultante por
# pantalla; en caso contrario, dejar el string tal cual lo ingresó el usuario e imprimirlo por
# pantalla.

nombre=input("Ingrese un nombre: ")
ultima_letra=nombre[len(nombre)-1].lower()
print(nombre[len(nombre)-1])
if ultima_letra =="a" or ultima_letra =="e" or ultima_letra =="i" or ultima_letra =="o" or ultima_letra =="u":
    print(f"{nombre}!") 
else:
    print(nombre)


# 8) Escribir un programa que solicite al usuario que ingrese su nombre y el número 1, 2 o 3FaCu
# dependiendo de la opción que desee:
# 1. Si quiere su nombre en mayúsculas. Por ejemplo: PEDRO.
# 2. Si quiere su nombre en minúsculas. Por ejemplo: pedro.
# 3. Si quiere su nombre con la primera letra mayúscula. Por ejemplo: Pedro.
# El programa debe transformar el nombre ingresado de acuerdo a la opción seleccionada por el
# usuario e imprimir el resultado por pantalla. Nota: investigue uso de las funciones upper(),
# lower() y title() de Python para convertir entre mayúsculas y minúsculas

nombre=input("Ingrese su nombre: ")
print("----------------------------------------------")
print("Si quiere su nombre en mayúsculas - Opcion 1")
print("Si quiere su nombre en minúsculas. - Opcion 2")
print("Si quiere su nombre con la primera letra mayúscula. - Opcion 3")
print("----------------------------------------------")
opcion=int(input("Seleccione una opción: "))

if opcion == 1:
    print(nombre.upper())
elif opcion == 2:
    print(nombre.lower())
elif opcion == 3:
    print(nombre.title())
else:
    print("La opción ingresada no existe")


# 9) Escribir un programa que pida al usuario la magnitud de un terremoto, clasifique la
# magnitud en una de las siguientes categorías según la escala de Richter e imprima el resultado
# por pantalla:
# ● Menor que 3: "Muy leve" (imperceptible).
# ● Mayor o igual que 3 y menor que 4: "Leve" (ligeramente perceptible).
# ● Mayor o igual que 4 y menor que 5: "Moderado" (sentido por personas, pero
# generalmente no causa daños).
# ● Mayor o igual que 5 y menor que 6: "Fuerte" (puede causar daños en estructuras
# débiles).
# ● Mayor o igual que 6 y menor que 7: "Muy Fuerte" (puede causar daños significativos).
# ● Mayor o igual que 7: "Extremo" (puede causar graves daños a gran escala).


magnitud = float(input("Ingrese la magnitud del terremoto: "))
if 0 < magnitud < 3:
    print("Muy leve (imperceptible)")
elif 3 <= magnitud < 4:
    print("Leve (ligeramente perceptible)")
elif 4 <= magnitud < 5:
    print("Moderado (sentido por personas, pero generalmente no causa daños)")
elif 5 <= magnitud < 6:
    print("Fuerte (puede causar daños en estructuras débiles)")
elif 6 <= magnitud < 7:
    print("Muy Fuerte (puede causar daños significativos)")
elif magnitud >= 7:
    print("Extremo (puede causar graves daños a gran escala)")
else:
    print("Ese valor de magnitud no existe")


# 10) Escribir un programa que pregunte al usuario en cuál hemisferio se encuentra (N/S), qué mes
# del año es y qué día es. El programa deberá utilizar esa información para imprimir por pantalla
# si el usuario se encuentra en otoño, invierno, primavera o verano.

hemisferio = input("Ingrese en cual hemisferio se encuentra (N / S): ").lower()
mes = int(input("Ingrese el numero del mes: "))
dia = int(input("Ingrese el día: "))

if hemisferio == "n":
    if (mes == 12 and dia >=21) or (mes == 3 and dia<=20):
        print("Invierno")
    elif mes<3:
        print ("Invierno")
    elif (mes == 3 and dia >=21) or (mes == 6 and dia<=20):
        print("Primavera")
    elif mes<6:
        print ("Primavera")
    elif (mes == 6 and dia >=21) or (mes == 9 and dia<=20):
        print("Verano")
    elif mes<9:
        print ("Verano")
    else:
        print("Otoño")
elif hemisferio == "s":
    if (mes == 12 and dia >=21) or (mes == 3 and dia<=20):
        print("Verano")
    elif mes<3:
        print ("Verano")
    elif (mes == 3 and dia >=21) or (mes == 6 and dia<=20):
        print("Otoño")
    elif mes<6:
        print ("Otoño")
    elif (mes == 6 and dia >=21) or (mes == 9 and dia<=20):
        print("Invierno")
    elif mes<9:
        print ("Invierno")
    else:
        print("Primavera")  
else:
    print("Ese hemisferio no existe")
