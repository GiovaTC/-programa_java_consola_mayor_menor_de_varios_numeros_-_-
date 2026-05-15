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

        // SOLICITAR CANTIDAD DE NUMEROS .
        System.out.print("¿cuantos numeros desea ingresar?: ");
        cantidad = entrada.nextInt();

        // VALIDACION BASICA
        if (cantidad <= 0) {
            System.out.println("la cantidad debe ser mayor que cero. ");
            return;
        }

        // primer numero .
        System.out.print("ingrese el numero 1: ");
        numero = entrada.nextInt();

        mayor = numero;
        menor = numero;

        // CICLO PARA LOS DEMAS NUMEROS .
        for (int i = 2; i <= cantidad; i++) {

            System.out.print("ingrese el numero " + i + ": ");
            numero = entrada.nextInt();

            // VALIDAR MAYOR
            if (numero > mayor) {
                mayor = numero;
            }

            // VALIDAR MENOR
            if (numero < menor) {
                menor = numero;
            }
        }

        // RESULTADOS.
        System.out.println("\n========= RESULTADOS =========");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("================================");
    }
}