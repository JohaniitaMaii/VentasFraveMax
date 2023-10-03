package acceso;

import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    Conexion conexion = new Conexion();

    public void insertarClientes(Cliente cliente) {

        try {
            conn = conexion.conexionDB();
            sql = "INSERT INTO cliente(apellido, nombre, domicilio, telefono) VALUES (?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.executeUpdate();
            System.out.println("Cliente insertado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar un cliente");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public List<Cliente> listarClientes() {
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT * FROM cliente";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los clientes");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
        return clientes;
    }

    public void modificarCliente(Cliente cliente) {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Debe indicar el cliente");
        }

        try {
            conn = conexion.conexionDB();
            sql = "UPDATE cliente SET apellido = ?, nombre = ?, "
                    + "domicilio = ?, telefono = ? WHERE id_cliente = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());
            ps.executeUpdate();
            System.out.println("Cliente modificado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el cliente");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public void eliminarCliente(Cliente cliente) {

        try {
            conn = conexion.conexionDB();
            sql = "DELETE FROM cliente WHERE id_cliente = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ps.executeUpdate();
            System.out.println("Cliente eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public Cliente buscarPorID(int id) {
        Cliente cliente = new Cliente();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT * FROM cliente WHERE id_cliente = " + id + ";";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
            }
            System.out.println("Cliente en la Base de Datos");
        } catch (SQLException e) {
            System.out.println("El Cliente no se encuentra en el Sistema");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

        return cliente;
    }

}
