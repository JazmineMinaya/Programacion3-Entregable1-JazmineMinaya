import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante {
    private String matricula;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private int edad;
    private String carrera;
    private LocalDate fechaInscripcion;

    private ArrayList<Materia> materias;
    private ArrayList<Calificacion> calificaciones;

    public Estudiante() {
        setMatricula("");
        setNombreEstudiante("");
        setApellidoEstudiante("");
        setEdad(0);
        setCarrera("");
        setFechaInscripcion(null);

        materias = new ArrayList<>();
        calificaciones = new ArrayList<>();
    }

    public Estudiante(String matricula, String nombreEstudiante, String apellidoEstudiante, int edad, String carrera, LocalDate fechaInscripcion) {
        setMatricula(matricula);
        setNombreEstudiante(nombreEstudiante);
        setApellidoEstudiante(apellidoEstudiante);
        setEdad(edad);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);

        materias = new ArrayList<>();
        calificaciones = new ArrayList<>();
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
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
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

    public static void mostrarDatos(Estudiante estudiante) {
        System.out.println("\nMatricula: " + estudiante.getMatricula());
        System.out.println("Nombre: " + estudiante.getNombreEstudiante());
        System.out.println("Apellido: " + estudiante.getApellidoEstudiante());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Fecha de inscripcion: " + estudiante.getFechaInscripcion());
    }
}
