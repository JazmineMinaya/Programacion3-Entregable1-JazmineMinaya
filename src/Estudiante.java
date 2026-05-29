import java.time.LocalDate;

public class Estudiante {
    private String matricula;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private int edad;
    private String carrera;
    private LocalDate fechaInscripcion;

    public Estudiante() {
        setMatricula("");
        setNombreEstudiante("");
        setApellidoEstudiante("");
        setEdad(0);
        setCarrera("");
        setFechaInscripcion(null);
    }

    public Estudiante(String matricula, String nombreEstudiante, String apellidoEstudiante, int edad, String carrera, LocalDate fechaInscripcion) {
        setMatricula(matricula);
        setNombreEstudiante(nombreEstudiante);
        setApellidoEstudiante(apellidoEstudiante);
        setEdad(edad);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);
    }

    public String getMatricula() {
        return matricula;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }
    public int getEdad() {
        return edad;
    }
    public String getCarrera() {
        return carrera;
    }
    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
