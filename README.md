Maven + Dependencias + Validación de Expresiones + Ofuscación
Requisitos:

Java 8 o superior
Maven instalado

Instrucciones de Compilación:

Primero entrar a /data-structure-stack y ejecutar:

mvn clean install

Luego entrar a /stackHandler y ejecutar:

mvn clean package -Pobfuscate
Instrucciones de Ejecución:

Ejecutar el JAR normal:

java -jar target/stackHandler-1.0-SNAPSHOT.jar "(a+b)*[c-d]"

Ejecutar el JAR ofuscado:

java -jar target/stackHandler-1.0-SNAPSHOT-obfuscated.jar "(a+b)*[c-d]"
