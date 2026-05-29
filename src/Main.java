import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static ArrayList<Profesor> listaProfesores = new ArrayList<>();

    public static void mostrarMenu() {
        System.out.println("\n====================================");
        System.out.println("    SISTEMA DE GESTION ACADEMICA");
        System.out.println("====================================");
        System.out.println("\n1. Registrar estudiante");
        System.out.println("2. Registrar profesor");
        System.out.println("3. Registrar materia");
        System.out.println("4. Asignar materia a estudiante");
        System.out.println("5. Registrar calificacion");
        System.out.println("6. Buscar estudiante");
        System.out.println("7. Mostrar estudiantes");
        System.out.println("8. Mostrar materias");
        System.out.println("9. Mostrar reporte de promedios");
        System.out.println("10. Salir");
    }

    public static void registrarEstudiante() {
        System.out.println("\nREGISTRAR ESTUDIANTE:\n");

        System.out.print("Ingrese la matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombreEstudiante = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellidoEstudiante = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese la fecha de inscripción (AAAA-MM-DD): ");
        String fechaTexto = scanner.nextLine();
        LocalDate fechaInscripcion = LocalDate.parse(fechaTexto);

        Estudiante estudiante = new Estudiante(matricula, nombreEstudiante, apellidoEstudiante, edad, carrera, fechaInscripcion);

        listaEstudiantes.add(estudiante);
    }

    public static void registrarProfesor() {
        System.out.println("\nREGISTRAR PROFESOR:\n");

        System.out.print("Ingrese el codigo: ");
        String codigoProfesor = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombreProfesor = scanner.nextLine();

        System.out.print("Ingrese el apellido:  ");
        String apellidoProfesor = scanner.nextLine();

        System.out.print("Ingrese la especialidad: ");
        String especialidad = scanner.nextLine();

        Profesor profesor = new Profesor(codigoProfesor, nombreProfesor, apellidoProfesor, especialidad);

        listaProfesores.add(profesor);
    }

    public static void main(String[] args) {
    }
}