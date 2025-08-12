# 1) Crea una función recursiva que calcule el factorial de un número. Luego, utiliza esa
# función para calcular y mostrar en pantalla el factorial de todos los números enteros
# entre 1 y el número que indique el usuario

def Factorial(n):
    if n==1:
        return 1
    else:
        return n*Factorial(n-1)

numero = int(input("Ingrese un número: "))
print(f"El factorial de {numero} es {Factorial(numero)}")


# 2) Crea una función recursiva que calcule el valor de la serie de Fibonacci en la posición
# indicada. Posteriormente, muestra la serie completa hasta la posición que el usuario
# especifique.

def Fibo(n):
    if n == 1:
        return 0
    if n==2:
        return 1
    else:
        return Fibo(n-1)+Fibo(n-2)

posicion = int(input("Ingrese la posición que desea saber de la serie de Fibonacci: "))

print(f"La serie de Fibonacci hasta la posición {posicion} sería: ",end=" ")
for i in range(1,posicion+1):
    resultado=Fibo(i)
    print(resultado,end=" ")


# 3) Crea una función recursiva que calcule la potencia de un número base elevado a un
# exponente, utilizando la fórmula 𝑛
# 𝑚 = 𝑛 ∗ 𝑛
# (𝑚−1)
# . Prueba esta función en un
# algoritmo general.

def Potencia_recursiva(base, exponente):
    if exponente == 0:
        return 1
    elif exponente == 1:
        return base
    else:
        return base * Potencia_recursiva(base, exponente - 1)

base = int(input("Cual es la base a elevar?: "))
exponente = int(input("Y el exponente?: "))

print(f"{base} elevado a {exponente} da: {Potencia_recursiva(base,exponente)}")


# 4) Crear una función recursiva en Python que reciba un número entero positivo en base
# decimal y devuelva su representación en binario como una cadena de texto.
# Cuando representamos un número en binario, lo expresamos usando solamente ceros (0) y
# unos (1), en base 2. Para convertir un número decimal a binario, se puede seguir este
# procedimiento:
# 1. Dividir el número por 2.
# 2. Guardar el resto (0 o 1).
# 3. Repetir el proceso con el cociente hasta que llegue a 0.
# 4. Los restos obtenidos, leídos de abajo hacia arriba, forman el número binario.
# 🧠Ejemplo:
# Convertir el número 10 a binario:
# 10 ÷ 2 = 5 resto: 0
# 5 ÷ 2 = 2 resto: 1
# 2 ÷ 2 = 1 resto: 0
# 1 ÷ 2 = 0 resto: 1
# Leyendo los restos de abajo hacia arriba: 1 0 1 0 → El resultado binario es "1010".

def Correspondiente_binario(n,cadena):
    if n == 1 or n == 0:
        cadena+= str(n)
        return cadena
    else:
        cadena+= str(n%2)
        parte_entera=n//2
        return Correspondiente_binario(parte_entera,cadena)

decimal = int(input("Ingrese un número decimal a convertir en binario: "))    
cadena=""
binario ="".join(reversed(Correspondiente_binario(decimal,cadena)))
print(f"El correspondiente binario del decimal {decimal} es {binario}")


# 5) Implementá una función recursiva llamada es_palindromo(palabra) que reciba una
# cadena de texto sin espacios ni tildes, y devuelva True si es un palíndromo o False si no
# lo es.
#  Requisitos:
# La solución debe ser recursiva.
# No se debe usar [::-1] ni la función reversed().

def es_palindromo(palabra):
    nueva_palabra=""
    primera=0
    ultima=len(palabra)-1

    if primera >= ultima:
        return True
    else:
        if palabra[primera] == palabra[ultima]:
            for i in range(1,len(palabra)-1):
                nueva_palabra+=palabra[i]
            return es_palindromo(nueva_palabra)
        else:
            return False
        


palabra="neuquen"
print(es_palindromo(palabra)) 


# 6) Escribí una función recursiva en Python llamada suma_digitos(n) que reciba un
# número entero positivo y devuelva la suma de todos sus dígitos.
#  Restricciones:
# No se puede convertir el número a string.
# Usá operaciones matemáticas (%, //) y recursión.
# Ejemplos:
# suma_digitos(1234) → 10 (1 + 2 + 3 + 4)
# suma_digitos(9) → 9
# suma_digitos(305) → 8 (3 + 0 + 5)

def suma_digitos(n):
    if n//10 == 0:
        return n
    else:
        return (n % 10) + suma_digitos(n // 10)

print(suma_digitos(1234))
print(suma_digitos(9))
print(suma_digitos(305))


# 7) Un niño está construyendo una pirámide con bloques. En el nivel más bajo coloca n
# bloques, en el siguiente nivel uno menos (n - 1), y así sucesivamente hasta llegar al
# último nivel con un solo bloque.
# Escribí una función recursiva contar_bloques(n) que reciba el número de bloques en el
# nivel más bajo y devuelva el total de bloques que necesita para construir toda la
# pirámide.
#  Ejemplos:
# contar_bloques(1) → 1 (1)
# contar_bloques(2) → 3 (2 + 1)
# contar_bloques(4) → 10 (4 + 3 + 2 + 1)

def contar_bloques(n):
    if n==1:
        return n
    else:
        return n + contar_bloques(n-1)


print(contar_bloques(1))
print(contar_bloques(2))
print(contar_bloques(4))



# 8) Escribí una función recursiva llamada contar_digito(numero, digito) que reciba un
# número entero positivo (numero) y un dígito (entre 0 y 9), y devuelva cuántas veces
# aparece ese dígito dentro del número.
#  Ejemplos:
# contar_digito(12233421, 2) → 3
# contar_digito(5555, 5) → 4
# contar_digito(123456, 7) → 0 

def contar_digito(numero,digito):
    if numero < 10:
        if numero == digito:
            return 1
        else:
            return 0
    else:
        if numero%10 == digito:
            return 1 + contar_digito(numero//10,digito)
        else:
            return contar_digito(numero//10, digito)

print(contar_digito(12233421, 2))
print(contar_digito(5555, 5))
print(contar_digito(123456, 7))
