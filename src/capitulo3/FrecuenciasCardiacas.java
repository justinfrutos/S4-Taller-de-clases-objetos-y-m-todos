package capitulo3;

/**
 * Información de una persona y cálculos de frecuencia cardiaca (estimaciones AHA).
 */
public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido,
            int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public int obtenerEdadEnAnios() {
        return AyudaCardiaca.calcularEdadEnAnios(mesNacimiento, diaNacimiento, anioNacimiento);
    }

    public int obtenerFrecuenciaCardiacaMaxima() {
        return AyudaCardiaca.calcularFrecuenciaCardiacaMaxima(obtenerEdadEnAnios());
    }

    public RangoFrecuencia obtenerRangoFrecuenciaCardiacaEsperada() {
        return AyudaCardiaca.calcularRangoFrecuenciaEsperada(obtenerFrecuenciaCardiacaMaxima());
    }
}
