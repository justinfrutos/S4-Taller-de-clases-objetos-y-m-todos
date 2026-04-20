package capitulo3;

/**
 * Representa una fecha calendario (mes, día y año).
 * El constructor asume que los valores proporcionados son correctos.
 */
public class Fecha {

    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAnio(int anio) {
        this.anio = anio;
    }

    public int obtenerAnio() {
        return anio;
    }

    public void mostrarFecha() {
        System.out.printf("%d/%d/%d%n", mes, dia, anio);
    }
}
