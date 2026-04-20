package capitulo3;

/**
 * Demuestra las capacidades de la clase {@link Fecha}.
 */
public class PruebaFecha {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(4, 19, 2026);

        System.out.print("Fecha inicial: ");
        fecha.mostrarFecha();

        fecha.establecerMes(12);
        fecha.establecerDia(31);
        fecha.establecerAnio(2025);

        System.out.print("Fecha modificada: ");
        fecha.mostrarFecha();

        System.out.printf("Mes: %d, Día: %d, Año: %d%n",
                fecha.obtenerMes(), fecha.obtenerDia(), fecha.obtenerAnio());
    }
}
