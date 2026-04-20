package capitulo3;

import java.util.Scanner;

/**
 * Solicita datos del paciente y muestra perfil, BMI y frecuencias cardiacas estimadas.
 */
public class PruebaPerfilMedico {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Primer nombre: ");
            String nombre = entrada.nextLine().trim();
            System.out.print("Apellido: ");
            String apellido = entrada.nextLine().trim();
            System.out.print("Sexo: ");
            String sexo = entrada.nextLine().trim();
            System.out.print("Día de nacimiento: ");
            int dia = entrada.nextInt();
            System.out.print("Mes de nacimiento (1-12): ");
            int mes = entrada.nextInt();
            System.out.print("Año de nacimiento: ");
            int anio = entrada.nextInt();
            System.out.print("Altura (cm): ");
            double altura = entrada.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = entrada.nextDouble();

            PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

            System.out.println("\n--- Información del perfil ---");
            System.out.printf("Nombre: %s %s%n", perfil.obtenerPrimerNombre(), perfil.obtenerApellido());
            System.out.printf("Sexo: %s%n", perfil.obtenerSexo());
            System.out.printf("Fecha de nacimiento: %d/%d/%d%n",
                    perfil.obtenerDiaNacimiento(),
                    perfil.obtenerMesNacimiento(),
                    perfil.obtenerAnioNacimiento());
            System.out.printf("Altura: %.1f cm%n", perfil.obtenerAlturaEnCentimetros());
            System.out.printf("Peso: %.1f kg%n", perfil.obtenerPesoEnKilogramos());

            int edad = perfil.obtenerEdadEnAnios();
            double bmi = perfil.obtenerIndiceMasaCorporal();
            int maxima = perfil.obtenerFrecuenciaCardiacaMaxima();
            RangoFrecuencia esperado = perfil.obtenerRangoFrecuenciaCardiacaEsperada();

            System.out.println("\n--- Cálculos (estimaciones; consulte a un profesional de salud) ---");
            System.out.printf("Edad: %d años%n", edad);
            System.out.printf("BMI: %.1f%n", bmi);
            System.out.printf("Frecuencia cardiaca máxima: %d lpm%n", maxima);
            System.out.printf("Rango de frecuencia cardiaca esperada: %.0f - %.0f lpm%n",
                    esperado.obtenerMinimo(), esperado.obtenerMaximo());

            System.out.println("\n--- VALORES DE BMI ---");
            System.out.println("Bajo peso: menos de 18.5");
            System.out.println("Normal: entre 18.5 y 24.9");
            System.out.println("Sobrepeso: entre 25 y 29.9");
            System.out.println("Obeso: 30 o más");
        }
    }
}
