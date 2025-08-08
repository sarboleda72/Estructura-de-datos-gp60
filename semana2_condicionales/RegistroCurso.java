import java.util.Scanner;

public class RegistroCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Lectura de datos (Secuencial)
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Pago realizado? (true/false): ");
        boolean pagoRealizado = sc.nextBoolean();

        System.out.print("Ingrese la nota del examen de admisión: ");
        double nota = sc.nextDouble();

        // 2. Validar requisitos (Compuesta + operadores lógicos)
        if (edad >= 16 && pagoRealizado) {

            System.out.println("\nBienvenido(a) " + nombre + ", requisitos básicos aprobados.");

            // 3. Evaluar nota (Condicional anidada)
            if (nota >= 4.5) {
                System.out.println("Ingreso con beca completa.");
            } else if (nota >= 3.0) {
                System.out.println("Ingreso aprobado.");
            } else {
                System.out.println("Ingreso rechazado por bajo puntaje.");
            }

        } else {
            // 4. Motivo del rechazo (Condicional simple)
            if (edad < 16) {
                System.out.println("No cumple con la edad mínima.");
            }
            if (!pagoRealizado) {
                System.out.println("No se ha realizado el pago.");
            }
        }

        sc.close();
    }
}
