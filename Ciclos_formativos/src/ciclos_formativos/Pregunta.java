import java.lang.reflect.Array;

/**
 *
 * @author gabri
 */
public class Pregunta {

    private String[] respuesta;

    private String respuestaValida;

    private String enunciado;
    
    /**
     *
     * @param enunciado
     * @param respuestaValida
     */
    public Pregunta (String enunciado, String respuestaValida){
    this.enunciado = enunciado;
    this.respuestaValida = respuestaValida;
}

    /**
     * @return the respuesta
     */
    public String[] getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the respuestaValida
     */
    public String getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(String respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}