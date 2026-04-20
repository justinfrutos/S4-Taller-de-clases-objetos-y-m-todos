package capitulo3;

/**
 * Demuestra las capacidades de la clase {@link Factura}.
 */
public class PruebaFactura {

    public static void main(String[] args) {
        Factura factura = new Factura("A-100", "Martillo de garra 16 oz", 3, 12.50);

        System.out.println("--- Factura inicial ---");
        imprimirFactura(factura);

        factura.establecerCantidad(5);
        factura.establecerPrecioPorArticulo(10.0);
        System.out.println("\n--- Tras actualizar cantidad y precio ---");
        imprimirFactura(factura);

        factura.establecerCantidad(-2);
        factura.establecerPrecioPorArticulo(-1.0);
        System.out.println("\n--- Tras intentar valores no positivos (se normalizan a 0) ---");
        imprimirFactura(factura);
        System.out.printf("Monto factura: %.2f%n", factura.obtenerMontoFactura());
    }

    private static void imprimirFactura(Factura f) {
        System.out.printf("Número de pieza: %s%n", f.obtenerNumeroPieza());
        System.out.printf("Descripción: %s%n", f.obtenerDescripcionPieza());
        System.out.printf("Cantidad: %d%n", f.obtenerCantidad());
        System.out.printf("Precio por artículo: %.2f%n", f.obtenerPrecioPorArticulo());
        System.out.printf("Monto de la factura: %.2f%n", f.obtenerMontoFactura());
    }
}
