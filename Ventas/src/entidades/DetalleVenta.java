package entidades;

/**
 *
 * @author johan
 */
public class DetalleVenta {
    
    private int idDetalle;
    private int cantidad;
    private Venta venta;
    private double precioVenta;
    private Producto producto;

    public DetalleVenta(int idDetalle, int cantidad, Venta venta, double precioVenta, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.venta = venta;
        this.precioVenta = precioVenta;
        this.producto = producto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", venta=" + venta + ", precioVenta=" + precioVenta + ", producto=" + producto + '}';
    }
    
    
}
