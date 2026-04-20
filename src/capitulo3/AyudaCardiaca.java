package capitulo3;

import java.time.LocalDate;
import java.time.Period;

/**
 * Cálculos basados en estimaciones habituales (AHA). No sustituyen consejo médico.
 */
final class AyudaCardiaca {

    private AyudaCardiaca() {
    }

    static int calcularEdadEnAnios(int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        LocalDate nacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    static int calcularFrecuenciaCardiacaMaxima(int edadEnAnios) {
        return 220 - edadEnAnios;
    }

    static RangoFrecuencia calcularRangoFrecuenciaEsperada(int frecuenciaCardiacaMaxima) {
        double minimo = 0.50 * frecuenciaCardiacaMaxima;
        double maximo = 0.85 * frecuenciaCardiacaMaxima;
        return new RangoFrecuencia(minimo, maximo);
    }
}
