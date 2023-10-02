package entidades;

/**
 *
 * @author johan
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private Persona clase;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String domicilio, String telefono, Persona clase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona getClase() {
        return clase;
    }

    public void setClase(Persona clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", telefono=" + telefono + ", clase=" + clase + '}';
    }
    
    
    
    
    
}
