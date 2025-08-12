
# 1) Crear un programa que imprima por pantalla el mensaje: “Hola Mundo!”.

print("Hola Mundo!")

# 2) Crear un programa que pida al usuario su nombre e imprima por pantalla un saludo usando
# el nombre ingresado. Por ejemplo: si el usuario ingresa “Marcos”, el programa debe imprimir
# por pantalla “Hola Marcos!”. Consejo: esto será más sencillo si utilizas print(f…) para
# realizar la impresión por pantalla.


nombre = input("Ingresa tu nombre: ")
print(f"Hola {nombre}!")


# 3) Crear un programa que pida al usuario su nombre, apellido, edad y lugar de residencia e
# imprima por pantalla una oración con los datos ingresados. Por ejemplo: si el usuario ingresa
# “Marcos”, “Pérez”, “30” y “Argentina”, el programa debe imprimir “Soy Marcos Pérez, tengo 30
# años y vivo en Argentina”. Consejo: esto será más sencillo si utilizas print(f…) para realizar
# la impresión por pantalla


nombre = input("Ingresa tu nombre: ")
apellido = input("Ingresa tu apellido: ")
edad = int(input("Ingresa tu edad: "))
residencia = input("Ingresa tu lugar de residencia: ")
print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}")


# 4) Crear un programa que pida al usuario el radio de un círculo e imprima por pantalla su área y
# su perímetro.

radio=float(input("Ingresa el radio de un círculo: "))
area=3.14*radio**2
perimetro=3.14*radio*2
print(f"el área es {area:.2f} y su perímetro {perimetro:.2f}")


# 5) Crear un programa que pida al usuario una cantidad de segundos e imprima por pantalla a
# cuántas horas equivale.

segundos=int(input("Ingrese una cantidad de segundos: "))
horas=segundos/60/60
print(f"{segundos} equivalen a {horas:.2f} hora/s")


# 6) Crear un programa que pida al usuario un número e imprima por pantalla la tabla de
# multiplicar de dicho número.

num = int(input("Ingresa un numero: "))
for i in range (1,11):
      print(f"{num} * {i} = {num*i}")


# 7) Crear un programa que pida al usuario dos números enteros distintos del 0 y muestre por
# pantalla el resultado de sumarlos, dividirlos, multiplicarlos y restarlos

num1=int(input("Ingrese el primer número (distinto de cero): "))
num2=int(input("Ingrese el segundo número (distinto de cero): "))
print(f"{num1} + {num2} = {num1+num2}")
print(f"{num1} / {num2} = {num1/num2:.1f}")
print(f"{num1} * {num2} = {num1*num2}")
print(f"{num1} - {num2} = {num1-num2}")


# 8) Crear un programa que pida al usuario su altura y su peso e imprima por pantalla su índice
# de masa corporal. Tener en cuenta que el índice de masa corporal se calcula del siguiente
# modo: 𝐼𝑀𝐶 = 𝑝𝑒𝑠𝑜 𝑒𝑛 𝑘𝑔 / (𝑎𝑙𝑡𝑢𝑟𝑎 𝑒𝑛 𝑚)**2

altura=float(input("Ingrese su altura(mt): "))
peso = float(input("Ingrese su peso(Kg): "))
print(f"Su IMC = {peso/altura**2:.2f}")

# 9) Crear un programa que pida al usuario una temperatura en grados Celsius e imprima por
# pantalla su equivalente en grados Fahrenheit. Tener en cuenta la siguiente equivalencia:
# 𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑎 𝑒𝑛 𝐹𝑎ℎ𝑟𝑒𝑛ℎ𝑒𝑖𝑡 = 9/5 * 𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑎 𝑒𝑛 𝐶𝑒𝑙𝑠𝑖𝑢𝑠 + 32

temp=float(input("Ingrese la temperatura (°C): "))
print(f"{temp}°C equivalen a {9/5*temp+32}°F")

# 10) Crear un programa que pida al usuario 3 números e imprima por pantalla el promedio de
# dichos números.

n1=float(input("Ingrese el primer número: "))
n2=float(input("Ingrese el segundo número: "))
n3=float(input("Ingrese el tercer número: "))
promedio = (n1+n2+n3)/3
print(f"El promedio de estos tres números es {promedio:.1f}")

