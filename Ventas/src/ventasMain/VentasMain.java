package ventasMain;

import acceso.ClienteDAO;
import acceso.DetalleVentaDAO;
import acceso.ProductoDAO;
import acceso.UsuarioDAO;
import acceso.VentaDAO;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.Date;

/**
 *
 * @author johan
 */
public class VentasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO pedao = new ProductoDAO();
        Producto producto = new Producto(15);

//        pedao.insertarProductos(producto);//------------INSERTAR PRODUCTO
//        pedao.modificarProducto(producto);//-------------MODIFICAR PRODUCTO
//        pedao.eliminarProducto(producto);//-------------ELIMINAR PRODUCTO
//        
//        System.out.println("Lista de Productos");
//        for (Producto pro : pedao.listarProductos()) {
//            System.out.println(pro);
//        }
////        
//        System.out.println(pedao.buscarPorNombre("Lavarropa")); //BUSCAR PRODUCTO POR NOMBRE
//        System.out.println("Lista de Productos por ID Cliente");
//        for (Producto produ : pedao.listaProductosporID(1)) {
//            System.out.println(produ);
//        }

        System.out.println("");
//-------------------------------------------------------------------------------------------------------------
        ClienteDAO clidao = new ClienteDAO();
        Cliente cliente = new Cliente(1);

//        clidao.insertarClientes(cliente);//----------------INSERTAR CLIENTE
//        clidao.modificarCliente(cliente);//---------------MODIFICAR CLIENTE
//        System.out.println(clidao.buscarPorID(2));//-------BUSCAR CLIENTE POR ID
//        clidao.eliminarCliente(cliente);//-------------ELIMINAR CLIENTE
//        System.out.println("Lista de Clientes");
//        for (Cliente cli : clidao.listarClientes()) {
//            System.out.println(cli);
//        }
        //--------------------------------------------------------------------------------------
        VentaDAO vedao = new VentaDAO();

        Venta venta = new Venta(cliente, producto, Date.valueOf("2023-08-12"));

//        vedao.insertarVenta(venta);//--------------INSERTAR UNA VENTA
//        vedao.modificarVenta(venta);//--------------MODIFICAR UNA VENTA
//        vedao.eliminarVenta(venta);//--------------ELIMINAR UNA VENTA
//        System.out.println("");
//        System.out.println("Lista de Ventas");//------------------LISTAR LAS VENTAS
//        for (Venta ve : vedao.listarVentas()) {
//            System.out.println(ve);
//        }
//
//        System.out.println("");
//        System.out.println("Obtener Ventas por ID");//-----OBTENER VENTAS POR ID CLIENTE
//        for (Venta ve : vedao.obtenerVentasPorID(1)) {
//            System.out.println(ve);
//        }
//
//        System.out.println("");
//        System.out.println("Listar Clientes por ID de Productos ");
//        for (Cliente cli : vedao.obtenerClientesporProducto(5)) {//------------LISTAR LOS CLIENTES POR ID PRODUCTOS
//            System.out.println(cli);
//        }
//-------------------------------------------------------------------------------------------------------------------
        UsuarioDAO udao = new UsuarioDAO();
//        
//        System.out.println(udao.ingresoLogin("Soledad Lazzaroni", "SL123"));//-------------LOGUEA EL USUARIO

//--------------------------------------------------------------------------------------------------------------------
        DetalleVentaDAO detadao = new DetalleVentaDAO();
        Venta ven = new Venta();
        Cliente clin = new Cliente();
        for (DetalleVenta deta : detadao.listarDetalleVentas()) {//-----------------LISTA DE DETALLES DE VENTAS
            System.out.println(deta);
//            ven = vedao.listarVentasID(deta.getVenta().getIdVenta());
//            clin = clidao.buscarPorID(ven.getCliente().getIdCliente());
//            System.out.println(clin.getNombre());
        }

    }

}
