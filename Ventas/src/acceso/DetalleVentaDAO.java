package acceso;

import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleVentaDAO {
    
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    Conexion conexion = new Conexion();

    public List<DetalleVenta> listarDetalleVentas() {
        Cliente cliente = null;
        Producto producto = null;
        Venta venta = null;
        DetalleVenta detalleVenta = null;
        List<DetalleVenta> detalles = new ArrayList();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT * FROM detalleventa";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                producto = new Producto();
                venta = new Venta(cliente,producto);
                detalleVenta = new DetalleVenta(venta);
                detalleVenta.setIdDetalle(rs.getInt("id_detalleVenta"));
                detalleVenta.getVenta().setIdVenta(rs.getInt("id_venta"));
                detalleVenta.setCantidad(rs.getInt("cantidad"));
                detalleVenta.setPrecioTotal(rs.getDouble("precioTotalVentas"));
                detalles.add(detalleVenta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los detalles de ventas");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

        return detalles;
    }
    
    
    
    
}
