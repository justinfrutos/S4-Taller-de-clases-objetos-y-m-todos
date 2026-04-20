package capitulo3;

/**
 * Perfil médico básico de una persona (datos demográficos y métricas derivadas).
 */
public class PerfilMedico {

    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaEnCentimetros;
    private double pesoEnKilogramos;

    public PerfilMedico(String primerNombre, String apellido, String sexo,
            int diaNacimiento, int mesNacimiento, int anioNacimiento,
            double alturaEnCentimetros, double pesoEnKilogramos) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.alturaEnCentimetros = alturaEnCentimetros;
        this.pesoEnKilogramos = pesoEnKilogramos;
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

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }

    public String obtenerSexo() {
        return sexo;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public void establecerAlturaEnCentimetros(double alturaEnCentimetros) {
        this.alturaEnCentimetros = alturaEnCentimetros;
    }

    public double obtenerAlturaEnCentimetros() {
        return alturaEnCentimetros;
    }

    public void establecerPesoEnKilogramos(double pesoEnKilogramos) {
        this.pesoEnKilogramos = pesoEnKilogramos;
    }

    public double obtenerPesoEnKilogramos() {
        return pesoEnKilogramos;
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

    /**
     * Índice de masa corporal (kg/m²) con altura en centímetros.
     */
    public double obtenerIndiceMasaCorporal() {
        double alturaMetros = alturaEnCentimetros / 100.0;
        return pesoEnKilogramos / (alturaMetros * alturaMetros);
    }
}
