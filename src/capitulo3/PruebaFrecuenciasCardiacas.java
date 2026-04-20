package capitulo3;

import java.util.Scanner;

/**
 * Solicita datos de una persona y muestra edad y frecuencias cardiacas estimadas.
 */
public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Primer nombre: ");
            String nombre = entrada.nextLine().trim();
            System.out.print("Apellido: ");
            String apellido = entrada.nextLine().trim();
            System.out.print("Mes de nacimiento (1-12): ");
            int mes = entrada.nextInt();
            System.out.print("Día de nacimiento: ");
            int dia = entrada.nextInt();
            System.out.print("Año de nacimiento: ");
            int anio = entrada.nextInt();

            FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

            System.out.println("\n--- Datos ---");
            System.out.printf("Nombre: %s %s%n", persona.obtenerPrimerNombre(), persona.obtenerApellido());
            System.out.printf("Fecha de nacimiento: %d/%d/%d%n",
                    persona.obtenerMesNacimiento(),
                    persona.obtenerDiaNacimiento(),
                    persona.obtenerAnioNacimiento());

            int edad = persona.obtenerEdadEnAnios();
            int maxima = persona.obtenerFrecuenciaCardiacaMaxima();
            RangoFrecuencia esperado = persona.obtenerRangoFrecuenciaCardiacaEsperada();

            System.out.println("\n--- Resultados (estimaciones) ---");
            System.out.printf("Edad: %d años%n", edad);
            System.out.printf("Frecuencia cardiaca máxima: %d lpm%n", maxima);
            System.out.printf("Rango de frecuencia cardiaca esperada: %.0f - %.0f lpm%n",
                    esperado.obtenerMinimo(), esperado.obtenerMaximo());
        }
    }
}
