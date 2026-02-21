# Maven + Dependencias + Validación de Expresiones + Ofuscación

## Requisitos:

Java 8 o superior
Maven instalado

## Instrucciones de Compilación:

Primero entrar a /data-structure-stack y ejecutar:

mvn clean install

Luego entrar a /stackHandler y ejecutar:

mvn clean package -Pobfuscate
Instrucciones de Ejecución:

## Ejecutar el JAR normal:

java -jar target/stackHandler-1.0-SNAPSHOT.jar "(a+b)*[c-d]"

## Ejecutar el JAR ofuscado:

java -jar target/stackHandler-1.0-SNAPSHOT-obfuscated.jar "(a+b)*[c-d]"


## ¿Qué tanto se dificulta la lectura?
La verda si se complica bastante, cuando abri el JAR ofuscado en JD-GUI ya no entendia casi nada al principio porque los nombres de las clases y mmetodos estaban cambiados por letras como a,b,c. A mi ne costo
identificar cual era la clase principal y que hacia cada metodo, porque ya no tenian nombres claros como antes, tambien tuve que leer con mas calma para entender que estaba pasando.

## ¿Se pierde claridad estructural?

Sí definitivamente se pierde claridad, antes los nombres ayudaban a saber qué hacía cada cosa, pero después de la ofuscación ya no dicen nada, la estructura sigue ahí, pero no es tan fácil verla. A mí me confundió un poco porque ya no era tan obvio cómo estaban organizadas las clases.

## ¿Sigue siendo posible entender la lógica?
Si, todavia se puede entender pero cuesta mas. Aunque los nombres cambian, el flujo del programa sigue siendo el mismo, si uno analiza paso a paso, se puede dar cuenta de que recibe una expresión, la valida y
luego muestra el resultado. No es imposible entenderlo, solo que ya no es tan directo como antes.


