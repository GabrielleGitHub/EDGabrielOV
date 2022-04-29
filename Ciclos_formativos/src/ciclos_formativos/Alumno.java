public class Alumno extends Persona {

    private double notaMedia;

    private Modulo[] matricula;
    
    public Alumno(String nombre, String apellidos, String direccion, int telefono, String alias, String email) {
    super(nombre, apellidos, direccion, telefono, alias, email);
    }

    public void emitirCertificado() {
    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void matricular() {
    }

    /**
     * @return the notaMedia
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }
}
