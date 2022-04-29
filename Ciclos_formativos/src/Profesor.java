package ciclos_formativos;

/**
 *
 * @author gabri
 */
public class Profesor extends Persona {

    private String nrp;

    private Modulo[] docencia;
    
    /**
     *
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param telefono
     * @param alias
     * @param email
     */
    public Profesor(String nombre, String apellidos, String direccion, int telefono, String alias, String email) {
        super(nombre, apellidos, direccion, telefono, alias, email);
        this.nrp = nrp;
    }

    /**
     *
     */
    public void addModulo() {
    }

    /**
     * @return the nrp
     */
    public String getNrp() {
        return nrp;
    }

    /**
     * @param nrp the nrp to set
     */
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    /**
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }
}