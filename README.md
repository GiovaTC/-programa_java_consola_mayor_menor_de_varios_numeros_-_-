# -programa_java_consola_mayor_menor_de_varios_numeros_-_- :.
Programa Java Consola — Mayor y Menor de Varios Números ☕:

<img width="1024" height="1024" alt="image" src="https://github.com/user-attachments/assets/94445e20-9f0f-4352-9f6c-e410fd2b62f4" />  

```
Este programa en Java permite:

Ingresar varios números
Identificar el número mayor
Identificar el número menor
Mostrar resultados en consola
Usar ciclos y variables acumuladoras

Compatible con:

IntelliJ IDEA
Java JDK 17+
Consola Java
Código Completo
import java.util.Scanner;

public class MayorMenorNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad;
        int numero;
        int mayor;
        int menor;

        System.out.println("=================================");
        System.out.println(" MAYOR Y MENOR DE VARIOS NUMEROS ");
        System.out.println("=================================");

        // Solicitar cantidad de números
        System.out.print("¿Cuántos números desea ingresar?: ");
        cantidad = entrada.nextInt();

        // Validación básica
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        // Primer número
        System.out.print("Ingrese el número 1: ");
        numero = entrada.nextInt();

        mayor = numero;
        menor = numero;

        // Ciclo para los demás números
        for (int i = 2; i <= cantidad; i++) {

            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();

            // Validar mayor
            if (numero > mayor) {
                mayor = numero;
            }

            // Validar menor
            if (numero < menor) {
                menor = numero;
            }
        }

        // Resultados
        System.out.println("\n========= RESULTADOS =========");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("================================");
    }
}

Ejemplo de Ejecución:
=================================
 MAYOR Y MENOR DE VARIOS NUMEROS
=================================

¿Cuántos números desea ingresar?: 5

Ingrese el número 1: 10
Ingrese el número 2: 25
Ingrese el número 3: 3
Ingrese el número 4: 18
Ingrese el número 5: 40

========= RESULTADOS =========
Número mayor: 40
Número menor: 3
================================
Conceptos Utilizados:
Variables
Scanner
Ciclos for
Condicionales if
Comparaciones
Acumuladores
Programación estructurada

Posibles Mejoras 🚀:
Puedes ampliar el programa agregando:
Promedio de números
Suma total
Conteo de pares e impares
Validación de letras
Ordenamiento
Uso de arreglos
Interfaz gráfica con Swing
Conexión a base de datos.

Estructura Recomendada del Proyecto
MayorMenorNumeros
 ├── src
 │    └── MayorMenorNumeros.java
 └── out
