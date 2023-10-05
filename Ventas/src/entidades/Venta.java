package entidades;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author johan
 */
public class Venta {

    private int idVenta;
    private Cliente cliente;
    private Producto producto;
    private Date fechaVenta;

    public Venta() {
    }

    public Venta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(Cliente cliente, Producto producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public Venta(Cliente cliente, Producto producto, Date fechaVenta) {
        this.cliente = cliente;
        this.producto = producto;
        this.fechaVenta = fechaVenta;
    }

    public Venta(int idVenta, Cliente cliente, Producto producto, Date fechaVenta) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.producto = producto;
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta: " + "Id Venta= " + idVenta + ", Cliente= " + cliente.getIdCliente() + ", Producto= " + producto.getIdProducto() + ", Fecha Venta= " + fechaVenta;
    }

}
