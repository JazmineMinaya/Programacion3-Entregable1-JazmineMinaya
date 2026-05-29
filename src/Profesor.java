public class Profesor {
    private String codigoProfesor;
    private String nombreProfesor;
    private String apellidoProfesor;
    private String especialidad;

    public Profesor() {
        setCodigoProfesor("");
        setNombreProfesor("");
        setApellidoProfesor("");
        setEspecialidad("");
    }

    public Profesor(String codigoProfesor, String nombreProfesor, String apellidoProfesor, String especialidad) {
        setCodigoProfesor(codigoProfesor);
        setNombreProfesor(nombreProfesor);
        setApellidoProfesor(apellidoProfesor);
        setEspecialidad(especialidad);
    }

    public String getCodigoProfesor() {
        return codigoProfesor;
    }
    public String getNombreProfesor() {
        return nombreProfesor;
    }
    public String getApellidoProfesor() {
        return apellidoProfesor;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
