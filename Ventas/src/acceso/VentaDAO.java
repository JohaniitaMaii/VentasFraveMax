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
import javax.swing.JOptionPane;

public class VentaDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    Conexion conexion = new Conexion();

    public void insertarClientes(Venta venta) {
        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        try {
            conn = conexion.conexionDB();
            sql = "INSERT INTO venta(id_cliente, id_producto, fechadeVenta) VALUES (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ps.setInt(2, producto.getIdProducto());
            ps.setDate(3, Date.valueOf(venta.getFechaVenta()));
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

}
