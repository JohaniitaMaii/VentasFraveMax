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

    public void insertarDetalle(DetalleVenta detalle){//USADO EN VISTA VEMTAVIEW---------
        
        try {
            conn = conexion.conexionDB();
            sql = "INSERT INTO detalleventa(id_venta, id_producto, cantidad, precioTotalVentas) VALUES (?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, detalle.getVenta().getIdVenta());
            ps.setInt(2, detalle.getProducto().getIdProducto());
            ps.setInt(3, detalle.getCantidad());
            ps.setDouble(4, detalle.getPrecioTotal());
            ps.executeUpdate();
            System.out.println("Detalle insertado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar un detalle de Venta");
        }finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
    }
    
    

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
                venta = new Venta(cliente);
                detalleVenta = new DetalleVenta(venta,producto);
                detalleVenta.setIdDetalle(rs.getInt("id_detalleVenta"));
                detalleVenta.getVenta().setIdVenta(rs.getInt("id_venta"));
                detalleVenta.getProducto().setIdProducto(rs.getInt("id_producto"));
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
    
    public void eliminarDetalleVenta(int id){//USAR EN VENTADAO -- ELIMINAR VENTA
        
        try {
            conn = conexion.conexionDB();
            sql = "DELETE FROM detalleventa WHERE id_venta = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Detalles eliminados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los DetalleVenta");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
    }
    
    public List<DetalleVenta> buscarVentaCliente(int id) {
         List<DetalleVenta> detaVentas = new ArrayList<>();
        Venta ve = null;
        DetalleVenta deta = null;
        Producto pro = null;
        try {
            conn = conexion.conexionDB();
            sql = "SELECT p.nombreProducto, p.precioActual, dv.cantidad, v.fechadeVenta "
                    + "FROM venta v "
                    + "INNER JOIN detalleventa dv ON v.id_venta = dv.id_venta "
                    + "INNER JOIN producto p ON dv.id_producto = p.id_producto "
                    + "where id_cliente = " + id;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ve = new Venta();
                pro = new Producto();
                deta = new DetalleVenta(ve,pro,0,0);
                deta.getProducto().setNombreProducto(rs.getString("nombreProducto"));
                deta.getProducto().setPrecioActual(rs.getDouble("precioActual"));
                deta.setCantidad(rs.getInt("cantidad"));
                deta.getVenta().setFechaVenta(rs.getDate("fechadeVenta"));
                detaVentas.add(deta);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los DetalleVenta");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
       return detaVentas; 
    }
    
    
}
