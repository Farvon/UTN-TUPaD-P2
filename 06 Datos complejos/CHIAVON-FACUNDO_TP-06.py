import os


# 1) Dado el diccionario precios_frutas
# precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva':
# 1450}
# Añadir las siguientes frutas con sus respectivos precios:
# ● Naranja = 1200
# ● Manzana = 1500
# ● Pera = 2300

precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva':1450}

precios_frutas["Naranja"]=1200
precios_frutas["Manzana"]=1500
precios_frutas["Pera"]=2300

print(precios_frutas)
print("-"*70)

# 2) Siguiendo con el diccionario precios_frutas que resulta luego de ejecutar el código
# desarrollado en el punto anterior, actualizar los precios de las siguientes frutas:
# ● Banana = 1330
# ● Manzana = 1700
# ● Melón = 2800

precios_frutas.update({"Banana":1330,"Manzana":1700,"Melón":2800})
print(precios_frutas)
print("-"*70)



# 3) Siguiendo con el diccionario precios_frutas que resulta luego de ejecutar el código
# desarrollado en el punto anterior, crear una lista que contenga únicamente las frutas sin los
# precios.

lista_frutas=[]
for fruta in precios_frutas:
    lista_frutas.append(fruta)

print(lista_frutas)
print("-"*70)



# 4) Escribí un programa que permita almacenar y consultar números telefónicos.
# • Permití al usuario cargar 5 contactos con su nombre como clave y número como valor.
# • Luego, pedí un nombre y mostrale el número asociado, si existe.
# Ejemplo: contactos = {"juan":"123456","Ana":"987654"} / Consultar: "juan" -> muestra "123456"

guia_telefonica={}
for i in range(4):
    clave=input("Ingrese el nombre del contacto: ")
    valor=input("Ingrese el número del contacto: ")
    guia_telefonica[clave]=valor

contacto=input("Qué contacto desea consultar?: ")

if contacto in guia_telefonica:
    print(f"El número de {contacto} es {guia_telefonica[contacto]}")
else:
    print(f"El contacto {contacto} no existe en la guía")


# 5) Solicita al usuario una frase e imprime:
# • Las palabras únicas (usando un set).
# • Un diccionario con la cantidad de veces que aparece cada palabra.
# Ejemplo: 
# entrada -> "hola mundo hola"
# salida:
# palabras_unicas: {'hola','mundo'}
# recuento: {'hola':2, 'mundo':1}

palabras_unicas= set()
recuento={}
frase = input("Ingrese una frase: ")
palabras= frase.split()

for palabra in palabras:
    palabras_unicas.add(palabra)

for palabra in palabras:
    if palabra in palabras_unicas:
        if palabra in recuento:
            recuento[palabra]+=1
        else:
            recuento[palabra]=1

print(palabras_unicas)
print(recuento)



# 6) Permití ingresar los nombres de 3 alumnos, y para cada uno una tupla de 3 notas.
# Luego, mostrá el promedio de cada alumno.
# Ejempo alumnos= {
#     "Sofía":(10,9,8),
#     "Luis":(6,7,7)
# }

alumnos={}
for i in range (3):
    alumno=input("Ingrese el nombre de un alumno: ")
    nota1=int(input("Ingrese la nota 1: "))
    nota2=int(input("Ingrese la nota 2: "))
    nota3=int(input("Ingrese la nota 3: "))
    tupla_notas=(nota1,nota2,nota3)
    alumnos[alumno]=tupla_notas

for alumno in alumnos:
    suma_notas=0
    for nota in alumnos[alumno]:
        suma_notas+=nota
    promedio=suma_notas/3
    print(f"El promedio de las notas de {alumno} es {promedio}")



# 7) Dado dos sets de números, representando dos listas de estudiantes que aprobaron Parcial 1
# y Parcial 2:
# • Mostrá los que aprobaron ambos parciales.
# • Mostrá los que aprobaron solo uno de los dos.
# • Mostrá la lista total de estudiantes que aprobaron al menos un parcial (sin repetir).

aprobados_parcial1 = {101, 105, 110, 112, 115, 120}
aprobados_parcial2 = {110, 112, 125, 130, 105, 101}

aprobados_ambos_parciales = aprobados_parcial1 & aprobados_parcial2
aprobados_solo_uno = aprobados_parcial1.symmetric_difference(aprobados_parcial2)
aprobados_al_menos_uno = set(aprobados_parcial1.union(aprobados_parcial2))

print(f"Los que aprobaron ambos parciales: {aprobados_ambos_parciales}")
print(f"Los que aprobaron solo uno: {aprobados_solo_uno}")
print(f"Los que aprobaron al menos un parcial: {aprobados_al_menos_uno}")


# 8) Armá un diccionario donde las claves sean nombres de productos y los valores su stock.
# Permití al usuario:
# • Consultar el stock de un producto ingresado.
# • Agregar unidades al stock si el producto ya existe.
# • Agregar un nuevo producto si no existe.

almacen={}

def consultar_stock(producto):
    os.system('cls')
    if producto in almacen:
        print(f"Actualmente tenemos en stock {almacen[producto]} unidades del producto {producto}.")
    else:
        print(f"El producto {producto} no se encuentra en nuestro sistema.")
    return

def agregar_stock(producto):
    os.system('cls')
    if producto in almacen:
        print(f"Actualmente tenemos un stock de {almacen[producto]} unidades del producto {producto}")
        stock_a_agregar=int(input("Ingrese el stock que quiere agregar: "))
        almacen[producto]+=stock_a_agregar
        print(f"Se actualizó el stock correctamente. (stock actual = {almacen[producto]})")
    else:
        print(f"El producto {producto} no se encuentra en nuestro sistema.")
    return

def agregar_producto(producto):
    
    if producto not in almacen:
        nuevo_producto_stock=int(input("Ingrese el stock del nuevo producto: "))
        almacen[producto]=nuevo_producto_stock
        print("Producto agregado con éxito")
    else:
        print(f"El producto {producto} ya se encuentra en nuestro sistema.")
    return

salir=-1
os.system('cls')
while salir != 0:
    print("-"*30)
    print("Seleccione una opción: ")
    print("-"*30)
    print("1 - Consultar Stock")
    print("2 - Agregar Stock")
    print("3 - Agregar Producto")
    print("0 - Salir")
    print("-"*30)
    opcion=int(input("Opcion: "))
    print("-"*30)
    match opcion:
        case 1:
            producto=input("Ingrese el Producto a consultar: ")
            consultar_stock(producto)
        case 2:
            producto=input("Ingrese el Producto a agregar Stock: ")
            agregar_stock(producto)
        case 3:
            os.system('cls')
            producto=input("Ingrese el Producto a agregar: ")
            agregar_producto(producto)
        case 0:
            print("Saliendo del sistema....")
            salir=0
        case _:
            os.system('cls')
            print("Esa opcion no es válida")
            


# 9) Creá una agenda donde las claves sean tuplas de (día, hora) y los valores sean eventos.
# Ejemplo: agenda = {
#     ("lunes","10:00"):"Reunion",
#     ("martes","15:00"): "Clase de inglés"
# }
# Permití consultar qué actividad hay en cierto día y hora.


agenda = {}

def agregar_evento():
    nuevo_dia=input("Ingrese el día del evento: ").lower()
    nueva_hora=input("Ingrese el horario del evento (HH:MM): ")
    tupla_evento=(nuevo_dia,nueva_hora)
    if tupla_evento not in agenda:
        evento=input("Ingrese el evento: ").capitalize()
        agenda[tupla_evento]=evento
    else:
        print(f"Esa fecha ya posee agendado {agenda[tupla_evento]}")
    return

def consultar_actividad():
    dia=input("Ingrese el día a consultar: ").lower()
    hora=input("Ingrese el horario (HH:MM): ")
    tupla_evento=(dia,hora)
    if tupla_evento in agenda:
        print(f"El día {dia.capitalize()} a las {hora}hs tiene agendado {agenda[tupla_evento]}")
    else:
        print("No tiene eventos para esa fecha")
    return

salir=-1
os.system('cls')
while salir != 0:
    print("-"*30)
    print("Seleccione una opción: ")
    print("-"*30)
    print("1 - Agregar evento")
    print("2 - Consultar Actividad")
    print("0 - Salir")
    print("-"*30)
    opcion=int(input("Opcion: "))
    print("-"*30)
    match opcion:
        case 1:
            os.system('cls')
            agregar_evento()
        case 2:
            os.system('cls')
            consultar_actividad()
        case 0:
            print("Saliendo del sistema....")
            salir=0
        case _:
            os.system('cls')
            print("Esa opcion no es válida")


# 10) Dado un diccionario que mapea nombres de países con sus capitales, construí un nuevo
# diccionario donde:
# • Las capitales sean las claves.
# • Los países sean los valores.
# Ejemplo: original = {"Argentina":"Buenos Aires", "Chile":"Santiago"}
# invertido = {"Buenos Aires":"Argentina","Santiago":"Chile"}

original = {"Argentina":"Buenos Aires", "Chile":"Santiago"}
nuevo_diccionario={}

for pais in original:
    nuevo_diccionario[original[pais]]=pais

print(nuevo_diccionario)