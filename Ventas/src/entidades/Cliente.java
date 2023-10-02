package entidades;

/**
 *
 * @author johan
 */
public class Cliente extends Persona {
    
    private int idCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String apellido, String domicilio, String telefono, Persona clase) {
        super(nombre, apellido, domicilio, telefono, clase);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return  "Cliente{" + "idCliente=" + idCliente + super.toString() +'}';
    }
    
    
}
