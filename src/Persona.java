public class Persona {
    private String nombre;
    private String apellido;

    public Persona() {
        setNombre("");
        setApellido("");
    }

    public Persona(String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
