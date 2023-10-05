package entidades;

/**
 *
 * @author johan
 */
public class DetalleVenta {

    private int idDetalle;
    private int cantidad;
    private Venta venta;
    private double precioTotal;

    public DetalleVenta() {
    }

    public DetalleVenta(Venta venta) {
        this.venta = venta;
    }

    public DetalleVenta(int idDetalle, int cantidad, Venta venta, double precioTotal) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.venta = venta;
        this.precioTotal = precioTotal;
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

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Detalle Venta: " + "ID Detalle: " + idDetalle + ", Venta: " + venta.getIdVenta() + ", Cantidad: " + cantidad + ", Precio Total: " + precioTotal;
    }

}
