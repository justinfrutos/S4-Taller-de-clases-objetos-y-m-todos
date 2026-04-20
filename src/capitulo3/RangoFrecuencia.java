package capitulo3;

/**
 * Rango de frecuencia cardiaca esperada (p. ej. 50%–85% de la frecuencia máxima).
 */
public final class RangoFrecuencia {

    private final double minimo;
    private final double maximo;

    public RangoFrecuencia(double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public double obtenerMinimo() {
        return minimo;
    }

    public double obtenerMaximo() {
        return maximo;
    }
}
