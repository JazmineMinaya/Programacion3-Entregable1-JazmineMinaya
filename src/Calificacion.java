public class Calificacion {
    private Materia materia;
    private double calificacion;

    public Calificacion(Materia materia, double calificacion) {
        this.materia = materia;
        setCalificacion(calificacion);
    }

    public Materia getMateria() {
        return materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
