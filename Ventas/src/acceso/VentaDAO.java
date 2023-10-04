package acceso;

import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    Conexion conexion = new Conexion();

    public void insertarVenta(Venta venta) {
        try {
            conn = conexion.conexionDB();
            sql = "INSERT INTO venta(id_cliente, id_producto, fechadeVenta) VALUES (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setInt(2, venta.getProducto().getIdProducto());
            ps.setDate(3, venta.getFechaVenta());
            ps.executeUpdate();
            System.out.println("Venta insertada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar una venta");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public List<Venta> listarVentas() {
        Venta venta = null;
        Cliente cliente = null;
        Producto producto = null;
        Date fecha = new Date(0, 0, 0);
        List<Venta> ventas = new ArrayList<>();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT * FROM venta";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                producto = new Producto();
                venta = new Venta(cliente, producto, fecha);
                venta.setIdVenta(rs.getInt("id_venta"));
                venta.getCliente().setIdCliente(rs.getInt("id_cliente"));
                venta.getProducto().setIdProducto(rs.getInt("id_producto"));
                venta.setFechaVenta(rs.getDate("fechadeVenta"));
                ventas.add(venta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las Ventas");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
        return ventas;
    }

    public void modificarVenta(Venta venta) {//SE MODIFICA EL DATE

        if (venta == null) {
            JOptionPane.showMessageDialog(null, "Debe indicar una venta");
        } else {

            try {
                conn = conexion.conexionDB();
                sql = "UPDATE venta SET id_cliente = ?,  id_producto = ?, "
                        + "fechadeVenta = ? WHERE id_venta = ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, venta.getCliente().getIdCliente());
                ps.setInt(2, venta.getProducto().getIdProducto());
                ps.setDate(3, venta.getFechaVenta());
                ps.setInt(4, venta.getIdVenta());
                ps.executeUpdate();
                System.out.println("Venta modificada");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar la Venta");
            } finally {
                try {
                    conexion.desconectar();
                } catch (Exception ex) {
                    System.out.println("Error al desconectar");
                }
            }
        }

    }

    public void eliminarVenta(Venta venta) {

        try {
            conn = conexion.conexionDB();
            sql = "DELETE FROM venta WHERE id_venta = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, venta.getIdVenta());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Venta");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public List<Venta> obtenerVentasPorID(int id) {//VENTAS POR ID CLIENTE

        Venta venta = null;
        Cliente cliente = null;
        Producto producto = null;
        Date fecha = new Date(0, 0, 0);
        List<Venta> ventas = new ArrayList<>();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT * FROM venta v JOIN cliente c ON v.id_cliente = c.id_cliente WHERE v.id_cliente = " + id;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                producto = new Producto();
                venta = new Venta(cliente, producto, fecha);
                venta.setIdVenta(rs.getInt("id_venta"));
                venta.getCliente().setIdCliente(rs.getInt("id_cliente"));
                venta.getProducto().setIdProducto(rs.getInt("id_producto"));
                venta.setFechaVenta(rs.getDate("fechadeVenta"));
                ventas.add(venta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las Ventas por ID");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
        return ventas;

    }

    public List<Cliente> obtenerClientesporProducto(int idProducto) {
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT cliente.id_cliente, cliente.apellido, cliente.nombre, cliente.domicilio, cliente.telefono "
                    + "FROM cliente JOIN venta ON cliente.id_cliente = venta.id_cliente "
                    + "Where venta.id_producto = " + idProducto;
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
            JOptionPane.showMessageDialog(null, "Error al listar los clientes por Productos");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
        return clientes;
    }

    //LISTAS DE PRODUCTOS POR CLIENTE
    
}
