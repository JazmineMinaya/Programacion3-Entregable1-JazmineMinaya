public class Profesor extends Persona {
    private String codigoProfesor;
    private String especialidad;

    public Profesor() {
        super();
        setCodigoProfesor("");
        setEspecialidad("");
    }

    public Profesor(String codigoProfesor, String nombreProfesor, String apellidoProfesor, String especialidad) {
        super(nombreProfesor, apellidoProfesor);
        setCodigoProfesor(codigoProfesor);
        setEspecialidad(especialidad);
    }

    public String getCodigoProfesor() {
        return codigoProfesor;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
