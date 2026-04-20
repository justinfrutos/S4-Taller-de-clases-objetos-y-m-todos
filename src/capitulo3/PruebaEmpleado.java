package capitulo3;

/**
 * Demuestra las capacidades de la clase {@link Empleado}.
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", "García", 3500.0);
        Empleado empleado2 = new Empleado("Luis", "Martínez", 4200.0);

        System.out.println("--- Salarios anuales iniciales ---");
        mostrarSalarioAnual(empleado1);
        mostrarSalarioAnual(empleado2);

        aplicarAumentoPorcentual(empleado1, 10);
        aplicarAumentoPorcentual(empleado2, 10);

        System.out.println("\n--- Tras aumento del 10% ---");
        mostrarSalarioAnual(empleado1);
        mostrarSalarioAnual(empleado2);
    }

    private static void aplicarAumentoPorcentual(Empleado e, double porcentaje) {
        double nuevo = e.obtenerSalarioMensual() * (1.0 + porcentaje / 100.0);
        e.establecerSalarioMensual(nuevo);
    }

    private static void mostrarSalarioAnual(Empleado e) {
        System.out.printf("%s %s: salario anual = %.2f%n",
                e.obtenerPrimerNombre(),
                e.obtenerApellidoPaterno(),
                e.obtenerSalarioAnual());
    }
}
