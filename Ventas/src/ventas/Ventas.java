package ventas;

import acceso.ClienteDAO;
import acceso.ProductoDAO;
import acceso.VentaDAO;
import entidades.Cliente;
import entidades.Producto;

/**
 *
 * @author johan
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO pedao = new ProductoDAO();
        Producto producto = new Producto(2, "Heladera", "Semi-Automática", 130.000, 10, true);

//        pedao.insertarProductos(producto);//------------INSERTAR PRODUCTO
//        pedao.modificarProducto(producto);//-------------MODIFICAR PRODUCTO
//        pedao.eliminarProducto(producto);//-------------ELIMINAR PRODUCTO
//        
        System.out.println("Lista de Productos");
        for (Producto pro : pedao.listarProductos()) {
            System.out.println(pro);
        }
//        
//        System.out.println(pedao.buscarPorNombre("Lavarropa")); //BUSCAR PRODUCTO POR NOMBRE
        System.out.println("");
//-------------------------------------------------------------------------------------------------------------
        ClienteDAO clidao = new ClienteDAO();
        Cliente cliente = new Cliente(3);

//        clidao.insertarClientes(cliente);//----------------INSERTAR CLIENTE
//        clidao.modificarCliente(cliente);//---------------MODIFICAR CLIENTE
//        System.out.println(clidao.buscarPorID(2));//-------BUSCAR CLIENTE POR ID
//        clidao.eliminarCliente(cliente);//-------------ELIMINAR CLIENTE
        System.out.println("Lista de Clientes");
        for (Cliente cli : clidao.listarClientes()) {
            System.out.println(cli);
        }
        
        //--------------------------------------------------------------------------------------
        
        VentaDAO vendao = new VentaDAO();
        
        
        
        

    }

}
