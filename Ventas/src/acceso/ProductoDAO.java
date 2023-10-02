package acceso;

import entidades.Producto;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ProductoDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    Conexion conexion = new Conexion();

    public void insertarProductos(Producto producto) {

        try {
            conn = conexion.conexionDB();
            sql = "INSERT INTO producto(nombreProducto, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            System.out.println("Producto insertado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar un producto");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public List<Producto> listarProductos() {
        Producto producto = null;
        List<Producto> productos = new ArrayList<>();

        try {
            conn = conexion.conexionDB();
            sql = "SELECT * FROM producto where  estado = 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("id_producto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los productos");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }
        return productos;
    }

    public void modificarProducto(Producto producto) {
        if (producto == null) {
            JOptionPane.showMessageDialog(null, "Debe indicar el producto");
        }

        try {
            conn = conexion.conexionDB();
            sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, "
                    + "precioActual = ?, stock = ?, estado = ? WHERE id_producto = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            ps.executeUpdate();
            System.out.println("Producto modificado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public void eliminarProducto(Producto producto) {

        try {
            conn = conexion.conexionDB();
            sql = "DELETE FROM producto WHERE id_producto = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, producto.getIdProducto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception ex) {
                System.out.println("Error al desconectar");
            }
        }

    }

    public Producto buscarPorNombre(String nombre) {
        Producto pb = new Producto();
        if (nombre.isEmpty()) {
            System.out.println("Debe indicar el nombre del Producto");
        } else {
            try {
                conn = conexion.conexionDB();
                String sql = "SELECT * FROM producto WHERE nombreProducto like '%" + nombre + "%';";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    pb.setIdProducto(rs.getInt("id_producto"));
                    pb.setNombreProducto(rs.getString("nombreProducto"));
                    pb.setDescripcion(rs.getString("descripcion"));
                    pb.setPrecioActual(rs.getDouble("precioActual"));
                    pb.setStock(rs.getInt("stock"));
                    pb.setEstado(rs.getBoolean("estado"));
                }
                System.out.println("Producto en la Base de Datos");
            } catch (Exception e) {
                System.out.println("El Producto no se encuentra en el Sistema");
            } finally {
                try {
                    conexion.desconectar();
                } catch (Exception ex) {
                    System.out.println("Error al desconectar");
                }
            }
        }
        return pb;
    }

}
