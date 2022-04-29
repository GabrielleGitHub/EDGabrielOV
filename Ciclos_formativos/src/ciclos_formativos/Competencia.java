package ciclos_formativos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Competencia {

    private String nombre;

    private String descripcion;
    
    /**
     *
     * @param nombre
     * @param descripcion
     */
    public Competencia (String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
