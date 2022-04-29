package ciclos_formativos;

/**
 *
 * @author gabri
 */
public class Tarea {

    private String descripcion;

    private double calificacion;
    
    /**
     *
     * @param descripcion
     * @param calificacion
     */
    public Tarea (String descripcion, double calificacion){
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    /**
     *
     */
    public void calificar() {
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
