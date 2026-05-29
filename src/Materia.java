public class Materia {
    private String codigoMateria;
    private String nombreMateria;
    private int cantidadCreditos;

    public Materia() {
        setCodigoMateria("");
        setNombreMateria("");
        setCantidadCreditos(0);
    }

    public Materia(String codigoMateria, String nombreMateria, int cantidadCreditos) {
        setCodigoMateria(codigoMateria);
        setNombreMateria(nombreMateria);
        setCantidadCreditos(cantidadCreditos);
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }
}
