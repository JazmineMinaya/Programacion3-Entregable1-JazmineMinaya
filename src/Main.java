import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    static ArrayList<Materia> listaMaterias = new ArrayList<>();

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

    public static void registrarMateria() {
        System.out.println("\nREGISTRAR MATERIA:\n");

        System.out.print("Ingrese el codigo: ");
        String codigoMateria = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombreMateria = scanner.nextLine();

        System.out.print("Ingrese la cantidad de creditos: ");
        int cantidadCreditos = scanner.nextInt();
        scanner.nextLine();

        Materia materia = new Materia(codigoMateria, nombreMateria, cantidadCreditos);

        listaMaterias.add(materia);
    }

    public static Materia buscarCodigoMateria(String materia) {
        for (Materia m : listaMaterias) {
            if (m.getCodigoMateria().equals(materia)) {
                return m;
            }
        }
        return null;
    }

    public static void asignarMateriaEstudiante() {
        System.out.println("\nASIGNAR MATERIA A ESTUDIANTE:\n");

        System.out.print("Ingrese el codigo de la materia: ");
        String codigoMateriaAsignar = scanner.nextLine();

        Materia materiaAsignar = buscarCodigoMateria(codigoMateriaAsignar);

        if (materiaAsignar == null) {
            System.out.println("\nMateria no encontrada");
            return;
        }

        System.out.print("Ingrese la matricula del estudiante: ");
        String matriculaEstudiante = scanner.nextLine();

        Estudiante estudianteMateriaAsignar = buscarEstudianteMatricula(matriculaEstudiante);

        if (estudianteMateriaAsignar == null) {
            System.out.println("\nEstudiante no encontrado");
            return;
        }

        estudianteMateriaAsignar.getMaterias().add(materiaAsignar);
    }

    public static void registrarCalificacion() {
        System.out.println("\nREGISTRAR CALIFICACION:\n");

        System.out.print("Ingrese la matricula del estudiante: ");
        String matriculaCalificar = scanner.nextLine();

        Estudiante estudianteCalificar = buscarEstudianteMatricula(matriculaCalificar);

        if (estudianteCalificar == null) {
            System.out.println("\nMatricula no encontrada");
            return;
        }

        System.out.print("Ingrese el codigo de la materia: ");
        String codigoMateriaCalificar = scanner.nextLine();

        Materia materiaCalificar = buscarCodigoMateria(codigoMateriaCalificar);

        if (materiaCalificar == null) {
            System.out.println("\nMateria no encontrada");
            return;
        }

        System.out.print("Ingrese la calificacion: ");
        double nota = scanner.nextDouble();
        scanner.nextLine();

        Calificacion calificacion = new Calificacion(materiaCalificar, nota);

        estudianteCalificar.getCalificaciones().add(calificacion);
    }

    public static Estudiante buscarEstudianteMatricula(String matricula) {
        for (Estudiante est : listaEstudiantes) {
            if (est.getMatricula().equals(matricula)) {
                return est;
            }
        }
        return null;
    }

    public static Estudiante buscarEstudianteNombre(String nombre) {
        for (Estudiante est : listaEstudiantes) {
            if (est.getNombreEstudiante().equalsIgnoreCase(nombre)) {
                return est;
            }
        }
        return null;
    }
    
    public static void buscarEstudiante() {
        int opcion = 0;

        do {
            System.out.println("\nBUSQUEDA DE ESTUDIANTES:\n");
            System.out.println("  1. Buscar estudiante mediante nombre");
            System.out.println("  2. Buscar estudiante mediante matricula");
            System.out.println("  3. Salir al menu principal");

            System.out.print("\nIngrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nombre: ");
                    String nombre = scanner.nextLine();

                    Estudiante nombreEstudiante  = buscarEstudianteNombre(nombre);

                    if (nombreEstudiante == null)
                        System.out.println("\nEstudiante no registrado en el sistema");
                    else
                        System.out.println("\nEstudiante registrado en el sistema");
                    break;
                
                case 2:
                    System.out.print("\nIngrese la matricula: ");
                    String matricula = scanner.nextLine();

                    Estudiante matriculaEstudiante = buscarEstudianteMatricula(matricula);

                    if (matriculaEstudiante == null)
                        System.out.println("\nEstudiante no registrado en el sistema");
                    else
                        System.out.println("\nEstudiante registrado en el sistema");
                    break;
                
                case 3: 
                    break;
                
                default:
                    System.out.println("\nOpcion invalida");
                    break;
            }
        } while (opcion != 3);

    }

    public static void mostrarDatosEstudiante() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados en el sistema");
        }
        else {
            System.out.println("\nLISTA DE ESTUDIANTES:");
            for (Estudiante est : listaEstudiantes) {
                Estudiante.mostrarDatos(est);
            }
        }
    }

    public static void mostrarDatosMateria() {
        System.out.println("\nLISTA DE MATERIAS:");

        if (listaMaterias.isEmpty()) {
            System.out.println("\nNo hay materias registradas en el sistema");
        }
        else {
            for (Materia m : listaMaterias) {
                Materia.mostrarDatos(m);
            }
        }
    }

    public static void mostrarReportePromedios() {
        System.out.println("\nREPORTE DE PROMEDIOS:");

        for (Estudiante est : listaEstudiantes) {
            if (listaEstudiantes.isEmpty()) {
                System.out.println("\nNo hay estudiantes registrados en el sistema");
            }
            else {
                double promedio = Estudiante.calificacionesEstudiante(est);
                System.out.println("\nEstudiante " + est.getNombreEstudiante() + " " + est.getApellidoEstudiante() + " (" + est.getMatricula() + "):");
                System.out.println("\tPromedio: " + promedio);
                
                if (promedio >= 70) 
                    System.out.println("\tEstudiante aprobado");
                else
                    System.out.println("\tEstudiante reprobado");
            }
        }
    }

    public static void main(String[] args) {
        int opcion = 0;

        do {
            mostrarMenu();

            System.out.print("\nIngrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                
                case 2:
                    registrarProfesor();
                    break;

                case 3:
                    registrarMateria();
                    break;

                case 4:
                    asignarMateriaEstudiante();
                    break;

                case 5:
                    registrarCalificacion();
                    break;
                
                case 6:
                    buscarEstudiante();
                    break;
                
                case 7:
                    mostrarDatosEstudiante();
                    break;
                
                case 8:
                    mostrarDatosMateria();
                    break;
                
                case 9:
                    mostrarReportePromedios();
                    break;
            }
        } while (opcion != 10);
    }
}